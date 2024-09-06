package Tree;

public class Tree {
    private TreeNode root;

    public Tree() {
        root = null;
    }
    public Tree (TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
