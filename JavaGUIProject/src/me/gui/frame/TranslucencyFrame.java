package me.gui.frame;
import static java.awt.GraphicsDevice.WindowTranslucency.*;
import java.awt.*;

public class TranslucencyFrame {
  public static void main(String[] args) {
    GraphicsEnvironment graphicsEnv = GraphicsEnvironment
    									.getLocalGraphicsEnvironment();

    GraphicsDevice graphicsDevice = graphicsEnv.getDefaultScreenDevice();

    boolean isSupported = graphicsDevice
    						.isWindowTranslucencySupported(PERPIXEL_TRANSPARENT);
    System.out.println("PERPIXEL_TRANSPARENT  supported: " + isSupported);

    isSupported = graphicsDevice.isWindowTranslucencySupported(TRANSLUCENT);
    System.out.println("TRANSLUCENT  supported: " + isSupported);

    isSupported = graphicsDevice
    				.isWindowTranslucencySupported(PERPIXEL_TRANSLUCENT);
    System.out.println("PERPIXEL_TRANSLUCENT  supported: " + isSupported);
  }
}