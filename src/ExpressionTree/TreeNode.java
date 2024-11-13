package ExpressionTree;

public class TreeNode {
    char data;
    TreeNode leftNode, rightNode;

    public TreeNode(char data) {
        this.data = data;
        leftNode = null;
        rightNode = null;
    }

    public TreeNode(char data, TreeNode leftNode, TreeNode rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public TreeNode() {
        this.data = 0;
        leftNode = null;
        rightNode = null;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
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
