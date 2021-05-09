import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.FontUIResource;

public class graph extends JPanel {

    Image img;
    Graphics2D g2;

    graph(int width, int height, Color clr) {
        img = new ImageIcon("beast.png").getImage();
        this.setPreferredSize(new DimensionUIResource(width, height));
        this.setBackground(clr);
    }

    public void paint(Graphics g) {
        super.paintComponent(g);
        g2 = (Graphics2D) g;
        g2.drawImage(img, -250, -100, null);

        g2.setColor(Color.BLUE);
        g2.setFont(new FontUIResource("Comic Sans", Font.BOLD, 32));
        g2.drawString("Java graphics", 250, 30);

        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(5));
        g2.drawLine(0, 0, ((int) (750 * Math.cos(45))), 500);
        g2.setColor(Color.BLUE);
        g2.drawLine(0, 500, 750, 0);

        int[] x_pts = { 0, 100, 250, 214, 260, 300, 323, 417 };
        int[] y_pts = { 0, 100, 150, 240, 186, 74, 203, 217 };

        g2.setColor(Color.GREEN);
        g2.setStroke(new BasicStroke(2));
        g2.drawPolyline(x_pts, y_pts, x_pts.length);

        int[] trig_x = { 100, 150, 50 };
        int[] trig_y = { 100, 150, 150 };

        g2.setColor(Color.PINK);
        g2.drawPolygon(trig_x, trig_y, 3);

        int[] trig_x1 = { 300, 350, 250 };
        int[] trig_y1 = { 300, 350, 350 };

        g2.setColor(Color.CYAN);
        g2.fillPolygon(trig_x1, trig_y1, 3);

        g2.fillRect(300, 0, 50, 50);
        g2.fillOval(300, 100, 150, 150);

        g2.setPaint(new Color(150, 20, 230));
        g2.drawArc(400, 150, 200, 200, 0, 150);

        GradientPaint grad_clr = new GradientPaint(250, 250, Color.BLUE, 450, 250, Color.RED);

        g2.setPaint(grad_clr);
        g2.fillArc(250, 250, 200, 200, 180, 330);

        g2.setPaint(Color.RED);
        g2.fillArc(50, 250, 200, 200, 0, 180);
        g2.setPaint(Color.WHITE);
        g2.fillArc(50, 250, 200, 200, 180, 180);

    }

}
