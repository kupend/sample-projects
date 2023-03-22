
import javax.swing.*;
import java.awt.*;

public class JTableEx extends Frame {
    JTableEx() {
        FlowLayout fl = new FlowLayout();
       this.setLayout(fl);

        //Container c = this.getContentPane();
        String rows[][] = {{"1","santosh","98"},{"2","suresh","85"}};
        String cols[] = {"R.No","Name","Marks"};
        JTable t = new JTable(rows,cols);
        JScrollPane jsp = new JScrollPane(t);

        //c.add(t);
    }

    public static void main(String[] args) {
        JTableEx f = new JTableEx();
        f.setSize(500,400);
        f.setVisible(true);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
