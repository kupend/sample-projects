import java.awt.*;

public class CardLayoutEx extends Frame {
    public static void main(String[] args) {
        CardLayoutEx f = new CardLayoutEx();
        f.setSize(300,400);
        f.setVisible(true);
        f.setBackground(Color.black);

        //setting layout

        CardLayout cl = new CardLayout();
        //setting layout to the frame
        f.setLayout(cl);

        //create button with label
        Button b1 = new Button("red");
        //Add this button to the frame
        f.add("Red",b1);
        Button b2 = new Button("black");
        f.add("Black",b2);
        Button b3 = new Button("green");

        f.add("green",b3);
        Button b4 = new Button("blue");
        //Add this button to the frame
        f.add("blue",b4);

        Button b5 = new Button("violet");

        f.add("violet",b5);

        cl.show(f,"green");


    }
}
