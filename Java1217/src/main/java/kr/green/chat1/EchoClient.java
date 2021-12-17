package kr.green.chat1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			// 1. IP주소와 포트번호를 이용하여 서버에 접속합니다.
			System.out.println("127.0.0.1서버의 10004번포트에 접속을 시도합니다.");
			socket = new Socket("192.168.0.69", 10004);
			System.out.println("연결 성공 : " + socket);
			// 2. 통신합니다.
			// 보내고
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.write("안녕 서버야\n");
			pw.flush();
			// 받기
			Scanner sc = new Scanner(socket.getInputStream());
			String message = sc.nextLine();
			System.out.println("받은 내용 : " + message);

			pw.close();
			sc.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 닫기
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
