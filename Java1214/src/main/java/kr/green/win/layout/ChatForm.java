package kr.green.win.layout;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatForm extends JFrame implements ActionListener{
	private static final long serialVersionUID = 5696666098886244877L;
	JTextArea  chatTA;
	JTextField messageTF;
	JButton    sendBtn;
	
	public ChatForm() {
		super("허접한 채팅 Ver 0.009");
		setSize(400,780);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new BorderLayout());
		
		chatTA = new JTextArea(20, 30);
		chatTA.setEditable(false);
		JScrollPane centerPanel = new JScrollPane(chatTA);
		add(centerPanel, BorderLayout.CENTER);
		
		JPanel messagePanel = new JPanel();
		messageTF = new JTextField(28);
		messageTF.setFont(new Font("굴림체", Font.BOLD, 22));
		messageTF.addActionListener(this);
		messagePanel.add(messageTF);
		sendBtn = new JButton("전송");
		sendBtn.addActionListener(this);
		messagePanel.add(sendBtn);
		add(messagePanel, BorderLayout.SOUTH);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new ChatForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = messageTF.getText();
		if(msg.trim().length()>0) {
			chatTA.append("나> " + msg.trim() + "\n");
		}
		messageTF.setText("");
		messageTF.requestFocus();
	}
	
}
