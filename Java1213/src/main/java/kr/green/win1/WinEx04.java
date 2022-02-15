package kr.green.win1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

// 마우스 Move Event지정해보자
public class WinEx04 extends JFrame implements MouseMotionListener{
	private static final long serialVersionUID = 5361805128059434806L;
	private JLabel pointLbl; // 마우스 좌표를 표시할 라벨
	
	public WinEx04() {
		super("마우스 Move Event 지정");
		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 라벨을 만들어 배치 한다.
		setLayout(new BorderLayout());
		pointLbl = new JLabel("");
		pointLbl.setFont(new Font("궁서체", Font.BOLD, 30));
		pointLbl.setBackground(Color.DARK_GRAY);
		add(pointLbl, BorderLayout.SOUTH);
		
		// 마우스 이벤트를 지정하자!!!
		addMouseMotionListener(this);
		
		//-------------------------------------------------------------
		// 메뉴를 달아보자
		// 1. 메뉴바를 만든다.
		JMenuBar menuBar = new JMenuBar();
		// 2. 메뉴를 만든다.
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		// 3. 메뉴 아이템을 만든다.
		ImageIcon newIcon = new ImageIcon("src/main/resources/new.png");
		JMenuItem newMenu = new JMenuItem("New", newIcon);
		newMenu.setMnemonic(KeyEvent.VK_N);
		
		ImageIcon openIcon = new ImageIcon("src/main/resources/open.png");
		JMenuItem openMenu = new JMenuItem("Open", openIcon);
		openMenu.setMnemonic(KeyEvent.VK_O);
		
		ImageIcon saveIcon = new ImageIcon("src/main/resources/save.png");
		JMenuItem saveMenu = new JMenuItem("Save", saveIcon);
		saveMenu.setMnemonic(KeyEvent.VK_S);
		
		ImageIcon exitIcon = new ImageIcon("src/main/resources/exit.png");
		JMenuItem exitMenu = new JMenuItem("Exit", exitIcon);
		exitMenu.setMnemonic(KeyEvent.VK_E);

		// 단축키 만들기 : 한번에 가기
		exitMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
		
		// 메뉴에 이벤트 지정
		exitMenu.addActionListener((e)->{
			System.exit(0);
		});
		// 4. 메뉴아이템을 메뉴에 붙인다.
		fileMenu.add(newMenu);
		fileMenu.add(openMenu);
		fileMenu.add(saveMenu);
		fileMenu.addSeparator(); // 구분자
		// 서브메뉴
		JMenu importMemnu = new JMenu("배경색");
		JMenuItem redMenu = new JMenuItem("빨강색");
		redMenu.addActionListener((e)->{
			getContentPane().setBackground(Color.red);
		});
		redMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK));
		
		importMemnu.add(redMenu);
		importMemnu.add(new JMenuItem("서브메뉴2"));
		importMemnu.add(new JMenuItem("서브메뉴3"));
		importMemnu.add(new JMenuItem("서브메뉴4"));
		fileMenu.add(importMemnu);
		
		
		fileMenu.addSeparator(); // 구분자
		fileMenu.add(exitMenu);
		// 5. 메뉴를 메뉴바에 붙인다.
		menuBar.add(fileMenu);
		// 6. 메뉴바를 프레임에 붙인다.
		setJMenuBar(menuBar);
		//-------------------------------------------------------------
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WinEx04();
	}
	
	@Override
	public void mouseDragged(MouseEvent e) { // 왼쪽버튼을 누르고 이동할때 작동
		
	}

	@Override
	public void mouseMoved(MouseEvent e) { // 마우스 이동할때 작동
		int x = e.getX();
		int y = e.getY();
		pointLbl.setText(String.format("x : %d, y : %d", x, y));
	}
	
}
