package Tree;

public class TreeNode {
    int data;
    TreeNode leftNode, rightNode;

    public TreeNode(int data) {
        this.data = data;
        leftNode = null;
        rightNode = null;
    }

    public TreeNode(int data, TreeNode leftNode, TreeNode rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public TreeNode() {
        this.data = 0;
        leftNode = null;
        rightNode = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public boolean isLeaf(){
        return this.getLeftNode() == null && this.getRightNode() == null;
    }
}
