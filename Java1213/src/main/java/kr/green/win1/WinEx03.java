package kr.green.win1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WinEx03 extends JFrame{
	private static final long serialVersionUID = -6763835793354454725L;
	// 프로그램 내에서 사용할 컴포넌트들은 필드로 선언한다.
	JButton exitBtn, bgBtn;
	
	private static Color[] stdCols = { Color.black, Color.blue, Color.cyan,
            						   Color.darkGray, Color.gray, Color.green, Color.lightGray,
            						   Color.magenta, Color.orange, Color.pink, Color.red,
            						   Color.white, Color.yellow };
	public WinEx03() {
		this("버튼 연습");
	}
	public WinEx03(String title) {
		super("버튼 연습");
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 아이콘을 지정해 보자!!!
		ImageIcon icon = new ImageIcon("src/main/resources/web.png");
		setIconImage(icon.getImage());
		
		// 배체 관리자 지정
		setLayout(new BorderLayout()); // 동서남북가운데를 지정하여 배치 한다.
		
		// 버튼 객체 생성
		exitBtn  = new JButton("Quit Button");
		// 버튼에 이벤트 등록
		/*
		exitBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		*/
		// 이벤트를 람다식으로 지정하기
		exitBtn.addActionListener((e)->{ System.exit(0); });
		
		// 버튼에 툴팁(풍선 도움말)을 달아보자
		exitBtn.setToolTipText("나를 누르면 프로그램이 종료 합니다.");
		
		// 바로가기 키(mnemonics)를 지정해보자!!!
		exitBtn.setMnemonic(KeyEvent.VK_Q); // Alt + Q를 지정한다.
		
		// 버튼을 프레임에 추가
		add(exitBtn, BorderLayout.SOUTH); // 윈도우의 하단에 추가해라!!!

		//---------------------------------------------------------------
		// 1. 버튼 객체를 만든다.
		bgBtn = new JButton("배경색(B) 바꾸기");
		// 2. 이벤트를 지정한다.
		bgBtn.addActionListener((e)->{
			Random rnd = new Random();
			getContentPane().setBackground(stdCols[rnd.nextInt(stdCols.length)]);
		});
		bgBtn.setMnemonic(KeyEvent.VK_B); // Alt + B를 지정한다.
		// 3. 프레임에 추가한다.
		add(bgBtn, BorderLayout.NORTH); // 상단에 추가
		//---------------------------------------------------------------
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// JDK 1.8 미만
		/*
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new WinEx03();				
			}
		});
		*/
		// JDK1.8이상의 람다식(익명함수)을 이용하면
		EventQueue.invokeLater(()->{
			new WinEx03();	
		});
	}

}
