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
        if (root == null){
            root = new TreeNode(data);
            return;
        } else {
            TreeNode bantu = root;
            while (true) {
                if (data < bantu.getData()) {
                    if (bantu.leftNode == null) {
                        bantu.leftNode = new TreeNode(data);
                        return;
                    } else {
                        bantu = bantu.leftNode;
                        return;
                    }
                } else if (data > bantu.getData()) {
                    if (bantu.rightNode == null) {
                        bantu.rightNode = new TreeNode(data);
                        return;
                    } else {
                        bantu = bantu.rightNode;
//                        bantu.setData(data);
                        return;
                    }
                }
//                else {
//                    return;
//                }
            }
        }
    }

//    public boolean isEmpty() {
//        if (root == null) {
//            return true;
//        }
//        return false;
//    }
}
