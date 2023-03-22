import java.awt.*;
import java.awt.event.*;

public class CheckBoxEx extends Frame implements ItemListener{
    Checkbox c1,c2,c3;
    CheckBoxEx() {
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);

        Checkbox c1 = new Checkbox("Telugu");
        this.add(c1);
        c1.addItemListener(this);
        Checkbox c2 = new Checkbox("english");
        this.add(c2);
        c2.addItemListener(this);
        Checkbox c3 = new Checkbox("hindi");
        this.add(c3);
        c3.addItemListener(this);
    }
    public void paint (Graphics g) {
        g.drawString("you have selected c1:"+ c1.getState(),10,100);
        g.drawString("you have selected c2:"+ c2.getState(),10,150);

        g.drawString("you have selected c3:"+ c3.getState(),10,200);

    }
    public static void main(String[] args) {


        CheckBoxEx f = new CheckBoxEx();
        f.setSize(400,330);
        f.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();


    }
}
