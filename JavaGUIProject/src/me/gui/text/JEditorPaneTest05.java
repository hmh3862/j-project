package me.gui.text;

import java.awt.BorderLayout;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

public class JEditorPaneTest05 extends JFrame {
	
	public JEditorPaneTest05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JEditorPaneTest05 - StyleSheet");
		setSize(300, 300);
		setLocationRelativeTo(null);

        JEditorPane jEditorPane = new JEditorPane();
        jEditorPane.setEditable(false);
        HTMLEditorKit kit = new HTMLEditorKit();
        jEditorPane.setEditorKit(kit);

        StyleSheet styleSheet = kit.getStyleSheet();
        styleSheet.addRule("body {color:#000; font-family:times; margin: 4px; }");
        styleSheet.addRule("h1 {color: blue;}");
        styleSheet.addRule("h2 {color: #ff0000;}");
        styleSheet.addRule("pre {font : 10px monaco; color : black; background-color : #fafafa; }");

         String htmlString = "<html>\n"
                          + "<body>\n"
                          + "<h1>Welcome!</h1>\n"
                          + "<h2>This is an H2 header</h2>\n"
                          + "<p>This is some sample text</p>\n"
                          + "<pre>     This is some <br/>          sample text</pre>\n"
                          + "</body>\n";
        
         Document doc = kit.createDefaultDocument();
        jEditorPane.setDocument(doc);
        jEditorPane.setText(htmlString);		

		JScrollPane main = new JScrollPane(jEditorPane);
		add(main, BorderLayout.CENTER);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JEditorPaneTest05();
	}
}