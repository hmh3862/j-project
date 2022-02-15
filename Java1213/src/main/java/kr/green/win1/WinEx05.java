package kr.green.win1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToolBar;

// 상태바를 만들어 보자 
public class WinEx05 extends JFrame{
	private static final long serialVersionUID = -3368019011478597275L;
	private JLabel statusBar;
	
	public WinEx05() {
		super("상태바 연습");
		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 배치 관리자 지정
		setLayout(new BorderLayout());
	
		// 상태바 만들기
		statusBar = new JLabel("Easy"); // 라벨로 만든다.
        statusBar.setBorder(BorderFactory.createEtchedBorder()); // 테두리 지정
        add(statusBar, BorderLayout.SOUTH); // 화면 하단에 붙이기
        
        // 메뉴바 만들기
     	JMenuBar menuBar = new JMenuBar();
     	JMenu viewMenu = new JMenu("View");
     	viewMenu.setMnemonic(KeyEvent.VK_V);
     	// 체크 박스 메뉴 아이템
     	JMenuItem showStatusBarMenuItem = new JCheckBoxMenuItem("Show statubar");
        showStatusBarMenuItem.setMnemonic(KeyEvent.VK_S);
        showStatusBarMenuItem.setDisplayedMnemonicIndex(5); // 6번째 글자에 _표시
        showStatusBarMenuItem.setSelected(true);

        showStatusBarMenuItem.addItemListener((e) -> { // 리스너 등록
            if (e.getStateChange() == ItemEvent.SELECTED) {
                statusBar.setVisible(true);
            } else {
                statusBar.setVisible(false);
            }
        });

        viewMenu.add(showStatusBarMenuItem);
        menuBar.add(viewMenu);
        
        // 라디오버튼 메뉴 아이템
     	JMenu bgMenu = new JMenu("배경색(B)");
     	bgMenu.setMnemonic(KeyEvent.VK_B); 
     	
     	JMenuItem bgRedItem = new JRadioButtonMenuItem("빨강색");
     	bgRedItem.addActionListener((e)->{
     		getContentPane().setBackground(Color.RED);
     	});
     	bgRedItem.setSelected(true);
     	getContentPane().setBackground(Color.RED);
     	
     	JMenuItem bgGreenItem = new JRadioButtonMenuItem("초록색");
     	bgGreenItem.addActionListener((e)->{
     		getContentPane().setBackground(Color.GREEN);
     	});
     	JMenuItem bgBlueItem = new JRadioButtonMenuItem("파란색");
     	bgBlueItem.addActionListener((e)->{
     		getContentPane().setBackground(Color.BLUE);
     	});
     	
     	// 라디오버튼 메뉴는 반드시 그룸으로 만들어 주어야 그룹 중에 1개만 선택됨 
     	ButtonGroup bgGroup = new ButtonGroup();
     	bgGroup.add(bgRedItem);
     	bgGroup.add(bgGreenItem);
     	bgGroup.add(bgBlueItem);
     	
     	bgMenu.add(bgRedItem);
     	bgMenu.add(bgGreenItem);
     	bgMenu.add(bgBlueItem);
     	
     	menuBar.add(bgMenu);
     	// ------------------------------------------------------------------------
     	// 메뉴의 오른쪽으로 보내기
     	JMenu helpMenu = new JMenu("Help");
     	menuBar.add(Box.createHorizontalGlue()); // 메뉴의 오른쪽으로 보내기
     	menuBar.add(helpMenu);
     	// ------------------------------------------------------------------------
     	// 팝업메뉴 : 오른쪽 버튼을 눌렀을때 나타나는 메뉴
     	JPopupMenu popupMenu = new JPopupMenu("팝업메뉴");
     	JMenuItem maxMenuItem = new JMenuItem("최대화");
     	maxMenuItem.addActionListener((e)->{
     		if (getExtendedState() != JFrame.MAXIMIZED_BOTH) {// 윈도우가 최대가 아니라면
                setExtendedState(JFrame.MAXIMIZED_BOTH); // 최대화 시키고
                maxMenuItem.setEnabled(false); // 더이상 누르지 못하도록 한다.
            }
     	});
     	popupMenu.add(maxMenuItem); // 팝업 메뉴에 추가
     	
     	// 팝업메뉴를 활성화 시켜보자
     	addMouseListener(new MouseAdapter() { // 마우스 이벤트 등록
     		@Override
            public void mouseReleased(MouseEvent e) { // 버튼이 눌려지면

                if (getExtendedState() != JFrame.MAXIMIZED_BOTH) { // 최대화가 아니라면
                	maxMenuItem.setEnabled(true); // 메뉴 활성화
                }

                if (e.getButton() == MouseEvent.BUTTON3) { // 오른쪽 버튼이 눌렸다면
                    popupMenu.show(e.getComponent(), e.getX(), e.getY()); // 팝업메뉴 보이기
                }
            }
		});
      	// ------------------------------------------------------------------------
     	// 툴바를 달아보자
     	// 1. 툴바를 만든다.
     	JToolBar toolBar = new JToolBar();
     	// 2. 툴바에 등록할 버튼들을 만든다.
     	ImageIcon exitIcon = new ImageIcon("src/main/resources/exit.png");
     	JButton exitButton = new JButton(exitIcon); // 이미지를 버튼에 붙이기
     	exitButton.addActionListener((e)->{
     		System.exit(0);
     	});
     	// 3. 툴바에 버튼들을 추가한다.
     	toolBar.add(exitButton);
     	// 4. 툴바를 프레인에 추가한다.
     	add(toolBar, BorderLayout.NORTH);
     	// ------------------------------------------------------------------------
     	setJMenuBar(menuBar);
        setVisible(true);
	}
	
	public static void main(String[] args) {
		new WinEx05();
	}
}
