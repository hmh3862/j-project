package me.gui.frame;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.UIManager;

public class LookNFeelList {
	public static void main(String[] a) {
		// 지원하는 LookAndFeel 리스트 얻기
		UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
		JFrame.setDefaultLookAndFeelDecorated(true);
		int i=0;
		try {
			for (UIManager.LookAndFeelInfo look : looks) {
				System.out.println(look.getClassName());
				UIManager.setLookAndFeel(look.getClassName());
				JFrame frame = new JFrame(look.getClassName());
				frame.setSize(400, 300);
				frame.setLocation(i*100, i++*100);
				frame.setLayout(new FlowLayout());
				
				JLabel label = new JLabel("나는 Label입니다.");
			    JTextField field = new JTextField("문자열 입력");
			    JList<String> list = 
			    		new JList<String>(new String[] { "11", "22", "33" });
			    JScrollPane listPane = new JScrollPane(list);
			    listPane.setPreferredSize(new Dimension(250, 100));

			    JScrollPane treePane = new JScrollPane(new JTree());
			    treePane.setPreferredSize(new Dimension(250, 100));
			    JButton button = new JButton("Click me");

			    JPanel cp = new JPanel();
			    cp.add(label);
			    cp.add(field);
			    cp.add(listPane);
			    cp.add(treePane);
			    cp.add(button);
			    
			    frame.setContentPane(cp);
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		} catch (Exception e) {
			System.err.println("Look and feel not set.");
		}
		
	}
}
