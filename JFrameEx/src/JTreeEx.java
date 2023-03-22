import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class JTreeEx extends JFrame {

    JTreeEx() {
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);
        Container c = this.getContentPane();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("object");
        DefaultMutableTreeNode comp = new DefaultMutableTreeNode("Component");
        root.add(comp);
        DefaultMutableTreeNode cont = new DefaultMutableTreeNode("Container");
        comp.add(cont );
        DefaultMutableTreeNode jcomp = new DefaultMutableTreeNode("jcomponent");
        comp.add(jcomp);
        DefaultMutableTreeNode jcomb = new DefaultMutableTreeNode("jcombobox");
        jcomp.add(jcomb);
        DefaultMutableTreeNode jtr = new DefaultMutableTreeNode("jtree");
        jcomp.add(jtr);
        DefaultMutableTreeNode jsr = new DefaultMutableTreeNode("jscrollbar");
        jcomp.add(jsr);
        JTree t = new JTree(root);
        c.add(t);

    }
    public static void main(String[] args) {
        JTreeEx f = new JTreeEx();
        f.setSize(500,400);
        f.setVisible(true);
    }
}
