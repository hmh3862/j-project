package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class PuzzleEx03 extends JFrame implements ActionListener, KeyListener {

	JButton[] buttons = new JButton[16];
	JButton startButton;
	JLabel clockLabel = new JLabel("00:00:00", JLabel.CENTER);
	Timer timer1;
	
	public PuzzleEx03() {
		setTitle("Puzzle Ver 0.09");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,500);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(new Color(89, 65, 200));
		topPanel.setBorder(new EmptyBorder(10, 0, 10, 0));
		topPanel.setLayout(new BorderLayout());
		JLabel titleLabel = new JLabel("숫자 순서대로 맞추기", JLabel.CENTER);
		titleLabel.setFont(new Font("굴림체", Font.BOLD, 30));
		topPanel.add(titleLabel,BorderLayout.NORTH);
		
		startButton = new JButton("Start");
		startButton.setFont(new Font("굴림체", Font.BOLD, 30));
		topPanel.add(startButton,BorderLayout.CENTER);
		startButton.addActionListener(this);
		
		clockLabel.setFont(new Font("굴림체", Font.BOLD, 30));
		topPanel.add(clockLabel,BorderLayout.SOUTH);
		
		add(topPanel,BorderLayout.NORTH);
		
		
		timer1 = new Timer(10, new ActionListener() {
			int count = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				int sec = count/100;
				int min = sec/60;
				sec = sec%60;
				int hour = min/60;
				min = min%60;
				int ms = count%100;
				clockLabel.setText(String.format("%02d:%02d:%02d.%02d", hour,min,sec,ms));
			}
		});

		// 이벤트 발생 시키기
		// ActionEvent fakeEvent = new ActionEvent( startButton, ActionEvent.ACTION_PERFORMED, "" );
		// actionPerformed(fakeEvent);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(4, 4));
		for(int i=0;i<buttons.length;i++){
			buttons[i] = new JButton(i+"");
			buttons[i].setFont(new Font("굴림체", Font.BOLD, 40));
			if(buttons[i].getText().equals("0"))
				centerPanel.add(new JLabel(""));  
			else
				centerPanel.add(buttons[i]);
		}
		add(centerPanel,BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		new PuzzleEx03().setVisible(true);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {

	}
	@Override
	public void keyPressed(KeyEvent e) {
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		if(button.equals(startButton)){
			if(startButton.getText().equals("Start")){
				startButton.setText("Stop");
				timer1.start();
			}else{
				startButton.setText("Start");
				timer1.stop();
			}
		}
	}
}
