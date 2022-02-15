package kr.green.net1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkEx01 {
	public static void main(String[] args) {
		InetAddress ip = null, myIP;
		InetAddress[] ipArraay;
		try {
			ip = InetAddress.getByName("www.naver.com"); // 해당 도메인의 주소 정보 알아내기
			System.out.println(ip);
			System.out.println(ip.getHostName()); // 컴퓨터 이름
			System.out.println(ip.getHostAddress()); // IP주소
			System.out.println(Arrays.toString(ip.getAddress())); // IP주소를 byte배열로 알아내기
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			ipArraay = InetAddress.getAllByName("naver.com"); // naver.com으로 끝나는 호스틀의 정보를 배열로
			for(InetAddress i : ipArraay) System.out.println(i);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			myIP = InetAddress.getLocalHost(); // 자신의 캄퓨터 정보
			System.out.println(myIP);
			System.out.println(myIP.getHostName());
			System.out.println(myIP.getHostAddress());
			System.out.println(InetAddress.getLoopbackAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
