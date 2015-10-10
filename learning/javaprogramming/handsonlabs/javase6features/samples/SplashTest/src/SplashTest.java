import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SplashTest {
    public static void main(String args[]) {
        Runnable runner = new Runnable() {
            public void run() {
                Random random = new Random();
                SplashScreen splash = SplashScreen.getSplashScreen();
                Graphics2D g = (Graphics2D)splash.createGraphics();
                Dimension dim = splash.getSize();
                Color colors[] = {Color.RED, Color.ORANGE,
                Color.YELLOW, Color.GREEN, Color.BLUE,
                Color.MAGENTA};
                for (int i=0; i<100; i++) {
                    g.setColor(colors[i % colors.length]);
                    g.fillRect(50, 50, dim.width-100, dim.height-100);
                    splash.update();
                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException ignored) {
                    }
                }
                JFrame frame = new JFrame("Splash Me2");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JLabel label =
                        new JLabel("Hello, Splash", JLabel.CENTER);
                frame.add(label, BorderLayout.CENTER);
                frame.setSize(300, 95);
                frame.setVisible(true);
            }
        };
        EventQueue.invokeLater(runner);
    }
}