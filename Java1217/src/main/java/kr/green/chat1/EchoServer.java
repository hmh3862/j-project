package kr.green.chat1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
	public static void main(String[] args) {
		// 통신이 되는지만 테스트해보는 서버 
		// 보통의 경우 문자열을 받고 받은 문자열을 그대로 다시 전송한다.
		
		ServerSocket serverSocket = null;
		Socket       clientSocket = null;
		try {
			// 1. 포트 번호를 1개 열어 서버소켓을 만든다.
			serverSocket = new ServerSocket(10004);
			// 2. 클라이언트의 접속을 기다린다.
			// 3. 접속되면 소켓 객체를 리턴한다.
			System.out.println("10004번 포트를 열어 접속을 대기 중입니다.......");
			clientSocket = serverSocket.accept();
			System.out.println("접속 성공 : " + clientSocket);
			// 4. 리턴된 소켓으로 통신을 한다.
			InputStream  is = clientSocket.getInputStream(); // 받기
			Scanner sc = new Scanner(is,"UTF-8");
			String message = sc.nextLine();
			System.out.println("받은 내용 : " + message);
			
			OutputStream os = clientSocket.getOutputStream();// 보내기
			PrintWriter pw = new PrintWriter(os);
			pw.write("반갑다 클라이언트\n");
			pw.flush();

			
			sc.close();
			pw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 5. 닫기
			try {
				clientSocket.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
