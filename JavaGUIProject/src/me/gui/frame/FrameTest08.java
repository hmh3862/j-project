package me.gui.frame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrameTest08 extends JFrame{
	public FrameTest08() {
		super("FrameTest08");
		setSize(300, 300);// 크기지정
		setLocationRelativeTo(null);// 화면 중앙에
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				int choice = JOptionPane.showConfirmDialog(null, "정말 종료하시겠습니까?",
						"종료확인", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (choice == 0) {
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}
		});
		
		setVisible(true);// 화면에 보이기
	}
	public static void main(String[] args) {
		new FrameTest08(); // 상속받은 클래스 객체 생성
	}
}
