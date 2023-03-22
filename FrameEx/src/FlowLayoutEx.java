import java.awt.*;

public class FlowLayoutEx extends Frame {
    public static void main(String[] args) {
        FlowLayoutEx f = new FlowLayoutEx();
        f.setSize(300,400);
        f.setVisible(true);
        f.setBackground(Color.yellow);

        //setting layout
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER,10,20);

        //setting layout to the frame
        f.setLayout(fl);

        //create button with label
        Button b1 = new Button("red");
        //Add this button to the frame
        f.add(b1);
        Button b2 = new Button("black");
        f.add(b2);
        Button b3 = new Button("green");

        f.add(b3);

    }
}
