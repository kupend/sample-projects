import java.awt.*;

public class BorderLayoutEx extends Frame {
    public static void main(String[] args) {
        BorderLayoutEx f = new BorderLayoutEx();
        f.setSize(300, 400);
        f.setVisible(true);
        f.setBackground(Color.yellow);

        //setting layout
        BorderLayout bl = new BorderLayout(10, 20);

        //setting layout to the frame
        f.setLayout(bl);

        //create button with label
        Button b1 = new Button("red");
        //Add this button to the frame
        f.add(b1,BorderLayout.EAST);
        Button b2 = new Button("black");
        f.add(b2,BorderLayout.WEST);
        Button b3 = new Button("green");

        f.add(b3,BorderLayout.NORTH);

    }
}


