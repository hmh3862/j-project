package kr.green.thred1;

import javax.swing.JOptionPane;

public class SingleThreadEx {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog(null, "이름을 입력하세요","홍길동", JOptionPane.OK_OPTION);
		System.out.println(name + "씨 반갑습니다.");
		
		for(int i=1;i<100;i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
