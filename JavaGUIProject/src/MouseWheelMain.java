
import java.awt.Graphics;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MouseWheelMain extends JFrame {
  private BufferedImage bi;

  private int zoom = 0;

  private static final double ZOOM_AMOUNT = 1.1;

  public static void main(String[] args) {
      new MouseWheelMain("img2.jpg").setVisible(true);
  }

  private void sizeToZoom() {
    double factor = Math.pow(ZOOM_AMOUNT, zoom);
    setSize((int) (bi.getWidth() * factor), (int) (bi.getHeight() * factor));
  }

  public MouseWheelMain(String filename) {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    try {
      bi = ImageIO.read(new File(filename));
    } catch (Exception e) {
      e.printStackTrace();
    }

    sizeToZoom();

    addMouseWheelListener(new MouseWheelListener() {
      public void mouseWheelMoved(MouseWheelEvent e) {
        int steps = e.getWheelRotation();
        zoom += steps;
        sizeToZoom();
      }
    });
  }

  public void paint(Graphics g) {
    g.drawImage(bi, 0, 0, getWidth(), getHeight(), this);
  }
}