import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComponentsEX  extends JFrame{

    JComponentsEX() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);
        Container c = this.getContentPane();
        //JLabel create
        JLabel jl = new JLabel("telugu web guru");
        c.add(jl);
                JButton b1 = new JButton("click me");
                c.add(b1);

    }
    public static void main(String[] args) {
        JComponentsEX f = new JComponentsEX();
        f.setSize(500,400);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);



    }
}
