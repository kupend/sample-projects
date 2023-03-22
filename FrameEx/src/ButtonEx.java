import java.awt.*;
import java.awt.event.*;

public class ButtonEx extends Frame implements ActionListener {

    ButtonEx() {
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);
        //step 1 create the component
        Button b1 = new Button("red");


        //add component to thew container
        this.add(b1);

        //add action listener to the component
        b1.addActionListener(this);

        Button b2 = new Button("blue");
        this.add(b2);
        b1.addActionListener(this);
    }



    public static void main(String[] args) {

        ButtonEx f = new ButtonEx();
        f.setSize(400, 300);
        f.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");

    }
}


