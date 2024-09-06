package Tree;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

    public class JTreeDemo extends JFrame{
        JTree tree;
        JLabel jlab;

        public void init(){
            try{
                SwingUtilities.invokeAndWait(
                        new Runnable(){
                            public void run(){
                                makeGUI();
                            }
                        }
                );
            }catch(Exception exc){
                System.err.println("Can't create because of " + exc);
            }
        }

        private void makeGUI(){
            DefaultMutableTreeNode top = new DefaultMutableTreeNode ("Option");
            DefaultMutableTreeNode a = new DefaultMutableTreeNode ("A");
            top.add(a);
            DefaultMutableTreeNode a1 = new DefaultMutableTreeNode ("A1");
            a.add(a1);
            DefaultMutableTreeNode a2 = new DefaultMutableTreeNode ("A2");
            a.add(a2);
            DefaultMutableTreeNode b = new DefaultMutableTreeNode ("B");
            top.add(b);
            DefaultMutableTreeNode b1 = new DefaultMutableTreeNode ("B1");
            b.add(b1);
            DefaultMutableTreeNode b2 = new DefaultMutableTreeNode ("B2");
            b.add(b2);
            DefaultMutableTreeNode b3 = new DefaultMutableTreeNode ("B3");
            b.add(b3);

            tree = new JTree(top);
            JScrollPane jsp = new JScrollPane(tree);
            add(jsp);
            jlab = new JLabel();
            add(jlab, BorderLayout.SOUTH);
            tree.addTreeSelectionListener(new TreeSelectionListener(){
                public void valueChanged(TreeSelectionEvent tse){
                    jlab.setText("Selection is " + tse.getPath());
                }
            });
            setTitle("JTree Demo");
            setSize(400, 300);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setVisible(true);
        }
        public static void main(String[] args) {
            JTreeDemo frame = new JTreeDemo();
            frame.init();
        }
    }

