package me.gui.layout;
import javax.swing.JApplet;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JWindow;


public class DefaultLayout {
	public static void main(String[] args) {
		JWindow window = new JWindow();
		System.out.println("JWindow Defalut Layout : " + window.getLayout());

		JFrame frame = new JFrame("JFrame");
		System.out.println("JFrame Defalut Layout : " + frame.getLayout());
		
		JDialog dialog = new JDialog();
		System.out.println("JDialog Defalut Layout : " + dialog.getLayout());
		
		JPanel panel = new JPanel();
		System.out.println("JPanel Defalut Layout : " + panel.getLayout());
		
		JApplet applet = new JApplet();
		System.out.println("JApplet Defalut Layout : " + applet.getLayout());
		
	}
}
