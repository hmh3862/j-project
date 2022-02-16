package me.gui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT_FirstGUI {
	public static void main(String[] args) {
		// 1. 디자인 단계
		// 1) Frame을 만든다.
		Frame frame = new Frame("첫번째 AWT GUI 프로그램");
		// 2) Frame의 크기를 지정한다.
		frame.setSize(300, 300);
		
		
		// 2. 윈도우 종료 기능 추가
		//    WindowListener를 등록하여 종료기능을 추가한다.
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		// 3) 메모리상에 만들어진 frame을 화면에 표시한다.
		frame.setVisible(true);
	}
}
