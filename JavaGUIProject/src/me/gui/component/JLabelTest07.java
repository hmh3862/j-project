package me.gui.component;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

/*from w ww.  ja  v  a 2  s  . c  om*/
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelTest07 extends JFrame {
	public JLabelTest07() {
		super("JLabelTest07 - UniCode");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(300, 300));
		setLayout(new GridLayout(3, 1));

		JLabel englishJLabel = new JLabel("\u0057\u0065\u006C\u0063"
				+ "\u006F\u006D\u0065\u0020\u0074\u006F\u0020Unicode\u0021");
		englishJLabel.setToolTipText("This is English");
		add(englishJLabel);

		JLabel chineseJLabel = new JLabel("\u6B22\u8FCE\u4F7F\u7528"
				+ "\u0020\u0020Unicode\u0021");
		chineseJLabel.setToolTipText("This is Traditional Chinese");
		add(chineseJLabel);

		JLabel japaneseJLabel = new JLabel("Unicode\u3078\u3087\u3045"
				+ "\u3053\u305D\u0021");
		japaneseJLabel.setToolTipText("This is Japanese");
		add(japaneseJLabel);

		setVisible(true);
	}
	public static void main(String[] args) {
		new JLabelTest07();
	}
}