package me.gui.frame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GradientWindow extends JFrame {
  public GradientWindow() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(300, 300);
    setLocationRelativeTo(null);

    setUndecorated(true);
    add(new TranslucentJPanel(Color.CYAN));
    
    JButton btnQuit = new JButton("종료하기");
    btnQuit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	});
    add(btnQuit, BorderLayout.NORTH);
    setVisible(true);
  }

  public static void main(String[] args) {
       new GradientWindow();
  }
}

class TranslucentJPanel extends JPanel {
  private int red,green, blue;

  public TranslucentJPanel(Color bgColor) {
    this.red = bgColor.getRed();
    this.green = bgColor.getGreen();
    this.blue = bgColor.getBlue();
  }

  @Override
  protected void paintComponent(Graphics g) {
    int width = getWidth();
    int height = getHeight();
    float startPointX = 0.0f;
    float startPointY = 0.0f;
    float endPointX = 0.0f;
    float endPointY = height;
    Color startColor = new Color(red, green, blue, 0);
    Color endColor = new Color(red, green, blue, 255);

    Paint paint = new GradientPaint(startPointX, startPointY, startColor,
        endPointX, endPointY, endColor);

    Graphics2D g2D = (Graphics2D) g;
    g2D.setPaint(paint);
    g2D.fillRect(0, 0, width, height);

  }
}
