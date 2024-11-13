package Tree;

public class Tree {
    private TreeNode root;

    public Tree() {
        root = null;
    }

    public Tree(TreeNode root) {
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

    public TreeNode getParent(TreeNode key) {
        TreeNode bantu = root;
        TreeNode parent = null;

        while (bantu != null && bantu != key) {
            parent = bantu;
            if (key.data == bantu.data) {
            } else if (key.data > bantu.data) {
                bantu = bantu.rightNode;
            } else {
                bantu = bantu.leftNode;
            }
        }
        return parent;
    }

    public TreeNode getPredecessor(TreeNode data) {
        TreeNode bantu = data.leftNode;
        while(bantu.rightNode != null){
            bantu = bantu.rightNode;
        }
        return bantu;
    }

    public boolean remove(int key) {
        TreeNode bantu = getNode(key);

        if (bantu == null) {
            return false;
        } else {
            if (bantu.data == root.data) {
                if (bantu.isLeaf()) {
                    root = null;
                } else if (bantu.rightNode == null) {
                    root = bantu.leftNode;
                } else if (bantu.leftNode == null) {
                    root = bantu.rightNode;
                } else {
                    TreeNode predecessor = getPredecessor(bantu);
                    TreeNode parentPredecessor = getParent(predecessor);
                    bantu.data = predecessor.data;

                    if (parentPredecessor != bantu) {
                        if (predecessor.leftNode != null) {
                            parentPredecessor.rightNode = predecessor.leftNode;
                        } else {
                            parentPredecessor.rightNode = null;
                        }
                    } else {
                        bantu.leftNode = predecessor.leftNode;
                    }
                }
                return true;
            } else {
                TreeNode parent = getParent(bantu);
                if (key < parent.data) {
                    if (bantu.isLeaf()) {
                        parent.leftNode = null;
                    } else if (bantu.rightNode == null) {
                        parent.leftNode = bantu.leftNode;
                    } else if (bantu.leftNode == null) {
                        parent.leftNode = bantu.rightNode;

                    } else {
                        TreeNode predecessor = getPredecessor(bantu);
                        TreeNode parentPredecessor = getParent(predecessor);
                        bantu.data = predecessor.data;

                        if (parentPredecessor != bantu) {
                            if (parentPredecessor != null) {
                                parentPredecessor.rightNode = predecessor.leftNode;
                            } else {
                                parentPredecessor.rightNode = null;
                            }
                        } else {
                            bantu.leftNode = predecessor.leftNode;
                        }
                    }
                } else {
                    if (bantu.isLeaf()) {
                        parent.rightNode = null;
                    } else if (bantu.rightNode == null) {
                        parent.rightNode = bantu.leftNode;
                    } else if (bantu.leftNode == null) {
                        parent.rightNode = bantu.rightNode;
                    } else {
                        TreeNode predecessor = getPredecessor(bantu);
                        TreeNode parentPredecessor = getParent(predecessor);
                        bantu.data = predecessor.data;

                        if (parentPredecessor != bantu) {
                            if (predecessor.leftNode != null) {
                                parentPredecessor.rightNode = predecessor.leftNode;
                            } else {
                                parentPredecessor.rightNode = null;
                            }
                        } else {
                            bantu.leftNode = predecessor.leftNode;
                        }
                    }

                }

                return true;
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
