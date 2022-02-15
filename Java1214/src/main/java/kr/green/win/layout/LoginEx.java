package kr.green.win.layout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginEx extends JFrame implements ActionListener{
	private static final long serialVersionUID = 7619982836534329806L;
	JButton loginBtn, cancelBtn;
	JLabel  useridLbl, passwordLbl;
	JTextField useridTF;
	JPasswordField passwordTF;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("취소")) {
			System.exit(0);
		}else {
			String userid = useridTF.getText();
			String password = new String(passwordTF.getPassword());
			JOptionPane.showMessageDialog(this, userid + "\n" + password);
		}
	}
	
	public LoginEx() {
		super("로그인폼 연습");
		setSize(400,180);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setLayout(new GridLayout(5, 1));
		
		JPanel linePanel1 = new JPanel();
		useridLbl = new JLabel("사용자   아이디 : ");
		useridTF = new JTextField(20);
		linePanel1.add(useridLbl);
		linePanel1.add(useridTF);
		add(linePanel1);
		JPanel linePanel2 = new JPanel();
		passwordLbl = new JLabel("사용자 비밀번호 : ");
		passwordTF = new JPasswordField(20);
		passwordTF.setEchoChar('*');
		linePanel2.add(passwordLbl);
		linePanel2.add(passwordTF);
		add(linePanel2);
		
		JPanel linePanel3 = new JPanel();
		add(linePanel3);

		JPanel linePanel4 = new JPanel();
		loginBtn = new JButton("로그인");
		loginBtn.addActionListener(this);
		linePanel4.add(loginBtn);
		
		cancelBtn = new JButton("취소");
		cancelBtn.addActionListener(this);
		linePanel4.add(cancelBtn);
		add(linePanel4);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LoginEx();
	}
	
	
}
