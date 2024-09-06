package BinarySearchTreeTest;

public class TestTree {
    private TestTreeNode root;

    public TestTree() {
        root = null;
    }
    public TestTree (TestTreeNode root) {
        this.root = root;
    }

    public void insert (int dataIsi){
        if (root == null){
            root = new TestTreeNode(dataIsi);
            return;
        }
        TestTreeNode current = root;
        TestTreeNode parent = null;

        while (true) {
            parent = current;
            if (dataIsi < current.getData()){
                current = current.getLeftNode();
                if (current == null){
                    parent.setLeftNode(new TestTreeNode(dataIsi));
                    return;
                }
            } else if (dataIsi > current.getData()) {
                current = current.getRightNode();
                if (current == null){
                    parent.setRightNode(new TestTreeNode(dataIsi));
                    return;
                }
            } else {
                return;
            }
        }
    }

    public TestTreeNode search (int dataIsi){
        TestTreeNode current = root;
        while (current != null) {
            if (dataIsi == current.getData()) {
                return current;
            } else if (dataIsi < current.getData()) {
                current = current.getLeftNode();
            } else {
                current = current.getRightNode();
            }
        }
        return null;
    }

    public TestTreeNode getRoot() {
        return root;
    }

    public void setRoot(TestTreeNode root) {
        this.root = root;
    }
}
