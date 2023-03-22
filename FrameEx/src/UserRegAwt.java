import java.awt.*;
import java.awt.event.*;

public class UserRegAwt extends Frame {

    Label l1,l2,l3;
    TextField tf1,tf2;
    UserRegAwt() {
        this.setLayout(null);

//        FlowLayout fl = new FlowLayout();
//        this.setLayout(fl);
        l1 = new Label("Name");
        l1.setBounds(30,30,80,20);
        this.add(l1);
        tf1 = new TextField("Enter Name Here",20);
        tf1.setBounds(150,30,80,20);
        this.add(tf1);

                l2 = new Label("Password");
        l2.setBounds(30,80,80,20);
        this.add(l2);
        tf2 = new TextField("Enter Password Here",20);
        tf2.setBounds(150,80,80,20);
        this.add(tf2);
        l3 = new Label("Address");
        l3.setBounds(30,120,80,20);
        this.add(l3);

        TextArea ta1 = new TextArea("", 30, 30, TextArea.SCROLLBARS_BOTH);

                ta1.setBounds(150,120,80,80);
                this.add(ta1);
    }

    public static void main(String[] args) {

        UserRegAwt f=new UserRegAwt();
        f.setSize(500,400);
        f.setVisible(true);
    }

}
