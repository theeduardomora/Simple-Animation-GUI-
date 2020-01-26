import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class DrawPanel {
    public static void main (String[] args) {
        DrawPanel bruh = new DrawPanel();

    }


    private JFrame frame;
    private JPanel panel;
    private JPanel panel2;
    private JButton button;
    private JTextField text;
    private JLabel label;


    DrawPanel() {

        //northpanel
        frame = new JFrame();
        label = new JLabel("Type your name");
        text = new JTextField(6);

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());

        panel2.add(label);
        panel2.add(text);



        frame.setTitle("Masterpiece");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        frame.add(panel2, BorderLayout.NORTH);

        Masterpiece bruh2 = new Masterpiece();
        bruh2.setSize(new Dimension (1000, 1000));
        bruh2.setBackground(Color.WHITE); //bruh2, our class, extends JPanel
        frame.add(bruh2, BorderLayout.CENTER);


        button = new JButton("Submit");
        frame.add(button, BorderLayout.SOUTH);

    }




}