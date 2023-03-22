import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Windowlistener {

    // program demonstrate event delegation model
    public static void main(String[] args) {
        //step-1 add the component
        Frame f = new Frame("Window listener example");
        f.setSize(400,300);
        f.setVisible(true);

        //step-2 add the listener
        f.addWindowListener(new Mylistener());

    }
}

class Mylistener implements WindowListener {

    //methods coding
    public void windowActivated(WindowEvent e) {}//open
    public void windowClosed(WindowEvent e) {}//close

    @Override
    public void windowOpened(WindowEvent e) {}//opened

    public void windowClosing (WindowEvent e) {System.exit(0);}
    public void windowDeactivated(WindowEvent e) {}//changed to next window
    public void windowDeiconified(WindowEvent e) {}//maximize
    public void windowIconified(WindowEvent e) {}// minimize



}



