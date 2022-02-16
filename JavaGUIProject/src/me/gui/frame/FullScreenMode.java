package me.gui.frame;
import java.awt.BorderLayout;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FullScreenMode extends JFrame {
	public FullScreenMode() {
		super("Full Screen Mode");
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		final GraphicsDevice device = env.getScreenDevices()[0];
		final DisplayMode originalDM = device.getDisplayMode();
		JButton btnQuit = new JButton("종료하기");
		btnQuit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				device.setDisplayMode(originalDM);
				System.exit(0);
			}
		});
		add(btnQuit,BorderLayout.SOUTH);
		boolean isFullScreen = device.isFullScreenSupported();
        setUndecorated(isFullScreen);
        if (isFullScreen) {
            // Full-screen mode
            device.setFullScreenWindow(this);
            validate();
        } else {
            // Windowed mode
            pack();
            setVisible(true);
        }
	}
	public static void main(String[] args) {
		new FullScreenMode();
	}
}
