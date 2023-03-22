import javax.swing.*;
import java.awt.*;

public class JTabbedPaneEx extends JFrame {

    JTabbedPaneEx() {
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);

        JTabbedPane p = new JTabbedPane(JTabbedPane.TOP);
        p.add("one",new Home());
        p.add("Two",new View());

        this.add(p);
        p.insertTab("three",null,new View(),
                "this is new tab",1);


    }
    public static void main(String[] args) {
        JTabbedPaneEx f = new JTabbedPaneEx();
        f.setSize(500,400);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class Home extends JPanel {
    Home() {
        JButton b1 = new JButton("image");
        JButton b2 = new JButton("tools");
        JButton b3 = new JButton("shapes");
        JButton b4 = new JButton("colours");

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
    }
}

class View extends JPanel {
    View() {
        JButton b1 = new JButton("zoom");
        JButton b2 = new JButton("hide");
        JButton b3 = new JButton("display");
        JButton b4 = new JButton("show");

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);

    }

}
