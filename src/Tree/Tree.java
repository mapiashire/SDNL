package Tree;

public class Tree {
    private TreeNode root;

    public Tree() {
        root = null;
    }
    public Tree (TreeNode root) {
        root = new TreeNode();
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getNode(int key) {
        TreeNode bantu = root;
        while (bantu != null) {
            if (key == bantu.getData()) {
                return bantu;
            } else {
                if (key < bantu.getData()) {
                    bantu = bantu.getLeftNode();
                } else {
                    bantu = bantu.getRightNode();
                }
            }
        }
        return bantu;
    }

    public void add(int data) {
        if (root == null) {
            root = new TreeNode(data);
            return;
        } else {
            TreeNode bantu = root;
            while (true) {
                if (data < bantu.getData()) {
                    if (bantu.getLeftNode() == null) {
                        bantu.setLeftNode(new TreeNode(data));
                        return;
                    } else {
                        bantu = bantu.getLeftNode();
                    }
                } else if (data > bantu.getData()) {
                    if (bantu.getRightNode() == null) {
                        bantu.setRightNode(new TreeNode(data));
                        return;
                    } else {
                        bantu = bantu.getRightNode();
                    }
                } else {
                    return;
                }
            }
        }
    }

    // function untuk mencari mainan kucing di pohon
    public void preOrderTraversal() {
        preOrderHelper(root);

    }

    public void preOrderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getData() + " ");
            preOrderHelper(localRoot.getLeftNode());
            preOrderHelper(localRoot.getRightNode());
        }
    }

    public void inOrderTraversal() {
        inOrderHelper(root);
    }

    public void inOrderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            inOrderHelper(localRoot.getLeftNode());
            System.out.print(localRoot.getData() + " ");
            inOrderHelper(localRoot.getRightNode());
        }
    }

    public void postOrderTraversal() {
        postOrderHelper(root);
    }

    public void postOrderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            postOrderHelper(localRoot.getLeftNode());
            postOrderHelper(localRoot.getRightNode());
            System.out.print(localRoot.getData() + " ");
        }
    }

//    public boolean isEmpty() {
//        if (root == null) {
//            return true;
//        }
//        return false;
//    }
}
