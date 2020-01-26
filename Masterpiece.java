import java.awt.*; // contains Point and Class methods
import java.awt.event.*;
import javax.swing.*;  // timer object in java.util package that is imported by default
import javax.swing.event.*;

public class Masterpiece extends JPanel implements ActionListener {
    private Point p1b;
    private Point p2h;
    private Point p3a;
    private Point p4a;
    private int dx;
    private int dy;

    public Masterpiece() {
        p1b = new Point(630, 200);
        p2h = new Point(630, 75);
        p3a = new Point(732, 210);
        p4a = new Point(430, 210);
        dx = 10;
        dy = 7;
        Timer time = new Timer(1, this);
        time.start();
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(p1b.x, p1b.y, 100, 200);
        g.setColor(Color.BLUE);
        g.fillOval(p2h.x, p2h.y, 90, 110);
        g.setColor(Color.RED);
        g.fillRect(p3a.x, p3a.y, 200, 30);
        g.fillRect(p4a.x, p4a.y, 200, 30);

    }


    public void actionPerformed(ActionEvent event) {
        p1b.x += dx;
        p2h.x += dx;
        p3a.x += dx;
        p4a.x += dx;
       /* if (p1b.x <= 0 || p1b.x + 200 >= getWidth()) {
            dx = -dx;
        }
        if (p2h.x <= 0 || p2h.x + 90 >= getWidth()) {
            dx = -dx;
        } */

        if (p3a.x <= 0 || p3a.x + 200 >= getWidth()) {
            dx = -dx;
        }
        if (p4a.x <= 0 || p4a.x + 200 >= getWidth()) {
            dx = -dx;
        }
        repaint(); // instruct the panel to redraw itself
    }




}