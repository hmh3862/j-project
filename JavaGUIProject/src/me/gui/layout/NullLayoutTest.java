package me.gui.layout;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NullLayoutTest extends JFrame{
	JButton[] btn;
	public NullLayoutTest() {
		super("NullLayout Test");
		setSize(400, 200);
		setLocationRelativeTo(null);
		
		setLayout(null);
		
		btn = new JButton[10];
		for(int i=0;i<btn.length;i++){
			btn[i] = new JButton("버튼" + (i+1));
			
			btn[i].setBounds(5+20*i,5+10*i, 100, 50);
			
			btn[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(
							getParent(), 
							e.getActionCommand() + " 눌렀음!");
				}
			});
			getContentPane().add(btn[i]);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new NullLayoutTest();
	}
}
