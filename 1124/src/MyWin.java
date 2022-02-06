import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWin {
	public static void main(String[] args) {
		JFrame frame = new JFrame("내가만든 윈도우"); // 윈도우 만들고
		frame.setSize(600,500); // 크기지정하고
		frame.setLocationRelativeTo(null); // 나타날 위치 지정하고(화면 중앙)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X누르면 종료하라고 하고
		
		// 배치 관리자 지정하고
		frame.setLayout(new BorderLayout());
		// 버튼 만들고
		JButton button = new JButton("눌러줘!!!");
		// 이벤트 지정하고
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "왜눌러 아프잖어", "경고", JOptionPane.CLOSED_OPTION);
			}
		});
		// 버튼을 윈도우에 붙이고
		frame.add(button,BorderLayout.SOUTH);
		
		frame.setVisible(true); // 보여줘!!!
	}
}
