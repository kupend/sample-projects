import javax.swing.*;
import java.awt.*;

public class SwingComp extends JFrame {

    SwingComp() {
        Container c = this.getContentPane();
        BorderLayout bl = new BorderLayout();

        JMenuBar mb = new JMenuBar();

        JMenu fil = new JMenu("File");
        mb.add(fil);
        JMenu edt = new JMenu("Edit");
        mb.add(edt);

        JMenuItem n = new JMenuItem("new");
        JCheckBoxMenuItem s = new JCheckBoxMenuItem("save");
        JMenuItem o = new JMenuItem("open");

        fil.add(n);
        fil.add(s);
        fil.add(o);

        JMenuItem cu = new JMenuItem("cut");
        JRadioButtonMenuItem co = new JRadioButtonMenuItem("copy");
        JMenuItem ps = new JMenuItem("paste");
        edt.add(cu);
        edt.add(co);
        edt.add(ps);


        c.add("North",mb);

    }
    public static void main(String[] args) {
        SwingComp f = new SwingComp();
        f.setSize(500,400);
        f.setVisible(true);
    }
}
