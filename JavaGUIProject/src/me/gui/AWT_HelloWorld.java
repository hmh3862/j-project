package me.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT_HelloWorld {
	public static void main(String[] args) {
		// 1. 디자인 단계
		// 1) Frame을 만든다.
		Frame frame = new Frame("AWT HelloWorld!!!!");
		// 2) Frame의 크기를 지정한다.
		frame.setSize(300, 300);

		// --------------------------------------------------------------------------
		// 윈도우 중앙에 배치하기
		// 해상도 구하기
		Toolkit toolKit = frame.getToolkit();
		Dimension screen = toolKit.getScreenSize();
		// 윈도우 크기 구하기
		Dimension window = frame.getSize();
		// 화면 중앙에 배치하기 위하여 위치값 계산
		int x = (screen.width - window.width) / 2;
		int y = (screen.height - window.height) / 2;
		// 윈도우 표시 위치 지정
		frame.setLocation(x, y);
		
		// --------------------------------------------------------------------------
		// AWT사용시 한글이 깨지는 경우에는 이클립스에서
		// Run Configurations --> Arguments --> VM arguments 에 다음을 입력해서 해결.
		// -Dfile.encoding=MS949를 추가한다.
		Label helloLbl = new Label("안녕!! Java AWT", Label.CENTER);
		helloLbl.setFont(new Font("굴림체", Font.BOLD, 25));
		helloLbl.setForeground(Color.RED);
		frame.add(helloLbl);
		// --------------------------------------------------------------------------

		// 2. 윈도우 종료 기능 추가
		// WindowListener를 등록하여 종료기능을 추가한다.
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
