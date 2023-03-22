import java.awt.*;

public class GraphicsEx extends Frame {
    public void paint (Graphics g){
        g.drawLine(120, 400, 300, 540);
        g.drawRect(340,440,350,350);
        g.setColor(Color.BLACK);
        g.fillOval(100,140,350,450);
        g.setColor(Color.GREEN);
        g.drawString("hello",489,600);

    }
    public static void main(String[] args) {
        GraphicsEx  f = new GraphicsEx ();
        f.setSize(400,500);
        f.setVisible(true);
    }
}
