package Tree;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TreeVisualization extends Canvas {
    private final Tree tree;

    public TreeVisualization(Tree tree) {
        this.tree = tree;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(42);
        tree.add(21);
        tree.add(38);
        tree.add(27);
        tree.add(71);
        tree.add(82);
        tree.add(55);
        tree.add(63);
        tree.add(6);
        tree.add(2);
        tree.add(40);
        tree.add(12);

        Frame frame = new Frame("Tree Visualization");
        TreeVisualization canvas = new TreeVisualization(tree);

        int[] isi = {12, 55, 21, 42};
//        int[] isi = {12, 55, 21};
//        int[] isi = {12, 55};
//        int[] isi = {12};
        for (int i = 0; i < isi.length; i++) {
            int hapusIsi = isi[i];
            System.out.println("\n\nHapus = " + hapusIsi);
            tree.remove(hapusIsi);

            frame.add(canvas);

        }

//        frame.add(canvas);
        frame.setSize(800, 600);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });


    }

    @Override
    public void paint(Graphics g) {
        if (tree != null && tree.getRoot() != null) {
            drawNode(g, tree.getRoot(), getWidth() / 2, 50, getWidth() / 4);
        }
    }

    private void drawNode(Graphics g, TreeNode node, int x, int y, int xOffset) {
//        int[] isi = {12, 27, 6, 55};
//        for (int i = 0; i < isi.length; i++) {
//            int hapusIsi = isi[i];
//        }

        g.setColor(Color.BLACK);
//        if (node.getData() == 55)
//            g.setColor(Color.RED);

        g.fillOval(x - 15, y - 15, 30, 30);
        g.setColor(Color.WHITE);
        g.drawString(Integer.toString(node.getData()), x - 5, y + 5);

        if (node.getLeftNode() != null) {
            g.setColor(Color.DARK_GRAY);
            g.drawLine(x, y, x - xOffset, y + 50);
            drawNode(g, node.getLeftNode(), x - xOffset, y + 50, xOffset / 2);
        }

        if (node.getRightNode() != null) {


            g.setColor(Color.DARK_GRAY);
            g.drawLine(x, y, x + xOffset, y + 50);
            drawNode(g, node.getRightNode(), x + xOffset, y + 50, xOffset / 2);

        }
    }
}