package ExpressionTree;

public class mainExpressionTree {
    public static void main(String[] args) {
        Tree expTree = new Tree();

        String helo = "(A+B)";
        expTree.addExpressionInfix(helo);

        System.out.println("Prefix order: ");
        expTree.prefix();

        System.out.println("Infix order: ");
        expTree.infix();

        System.out.println("Postfix order: ");
        expTree.postfix();
    }
}
