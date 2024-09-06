package BinarySearchTreeTest;

// the code is still faulty and needs to be fixed
// the toString() method in TestTreeNode.java should be modified
// the printTree() method in MainTree.java should be modified
// the is correct just need to be printed well

public class MainTree {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");

        TestTree pohon = new TestTree();
        pohon.insert(10);
        pohon.insert(20);
        pohon.insert(5);
        pohon.insert(7);
        pohon.insert(3);

//        System.out.println(pohon.search(3));
//        printTree(pohon.getRoot());
        System.out.println("Halo" + pohon.getRoot());
        System.out.println(pohon.search(20));
    }
//    public static void printTree(TestTreeNode node) {
//        if (node != null) {
//            printTree(node.getLeftNode());
//            System.out.println(node);
//            printTree(node.getRightNode());
//        }
//    }
}
