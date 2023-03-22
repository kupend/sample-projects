import java.awt.*;

public class GridLayoutEx extends Frame {
    public static void main(String[] args) {
        GridLayoutEx f = new GridLayoutEx();
        f.setSize(300,400);
        f.setVisible(true);
        f.setBackground(Color.black);

        //setting layout
        GridLayout gl = new GridLayout(2,3,12,32);

        //setting layout to the frame
        f.setLayout(gl);

        //create button with label
        Button b1 = new Button("red");
        //Add this button to the frame
        f.add(b1,BorderLayout.EAST);
        Button b2 = new Button("black");
        f.add(b2,BorderLayout.WEST);
        Button b3 = new Button("green");

        f.add(b3,BorderLayout.NORTH);
        Button b4 = new Button("blue");
        //Add this button to the frame
        f.add(b4,BorderLayout.SOUTH);

        Button b5 = new Button("violet");

        f.add(b5,BorderLayout.CENTER);


    }
}
