import javax.swing.*;
import java.awt.*;

public class JFrameEx {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Swing");
        f.setSize(500,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        //creating content pane
       Container c = f.getContentPane();
       //creating button
       JButton b1 = new JButton("click me");
       c.add(b1);

    }
}
