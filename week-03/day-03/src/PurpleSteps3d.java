import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {

    public static void mainDraw(Graphics graphics) {
        // reproduce this:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]
        int[] startingPoints = {10, 10};

        for (int i = 0; i < 6; i++) {
            graphics.setColor(new Color(187, 0, 236));
            graphics.fillRect(startingPoints[0], startingPoints[0], startingPoints[1], startingPoints[1]);
            graphics.setColor(Color.BLACK);
            graphics.drawRect(startingPoints[0], startingPoints[0], startingPoints[1], startingPoints[1]);
            startingPoints[0] += startingPoints[1];
            startingPoints[1] += 10;
        }

    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
