package BinarySearchTreeTest;

public class TestTreeNode {
    private int data;
    private TestTreeNode leftNode, rightNode;

    public TestTreeNode(int data) {
        this.data = data;
        leftNode = null;
        rightNode = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TestTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TestTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TestTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TestTreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public String toString() {
        return "Node(" +
                "data=" + data +
                ')';
    }
}
