package ExpressionTree;

import java.util.Stack;

public class Tree {

    private TreeNode root;

    public void addExpressionInfix(String x) {
        Stack<TreeNode> operand = new Stack<>();
        Stack<TreeNode> operator = new Stack<>();
        char fodder;

        for (int i = 0; i < x.length(); i++) {
            fodder = x.charAt(i);
            if (fodder == '('){
                operator.push(new TreeNode(fodder));
            } else if (isOperand(fodder)) {
                operand.push(new TreeNode(fodder));
            } else if (isOperator(fodder)) {
                while ((!operator.isEmpty() && operator.peek().getData() != '(')) {
                    TreeNode operatorNode, leftOperand, rightOperand;

                    operatorNode = operator.pop();
                    rightOperand = operand.pop();
                    leftOperand = operand.pop();

                    operatorNode.setRightNode(rightOperand);
                    operatorNode.setLeftNode(leftOperand);

                    operand.push(operatorNode);
                }
                operator.push(new TreeNode(fodder));
            } else if (fodder == ')') {
                while (!operator.isEmpty() && operator.peek().getData() != '(') {
                    TreeNode operatorNode, leftOperand, rightOperand;

                    operatorNode = operator.pop();
                    rightOperand = operand.pop();
                    leftOperand = operand.pop();

                    operatorNode.setRightNode(rightOperand);
                    operatorNode.setLeftNode(leftOperand);

                    operand.push(operatorNode);
                }
                operator.pop();
            }
        }
        while (!operator.isEmpty()) {
            TreeNode operatorNode, leftOperand, rightOperand;

            operatorNode = operator.pop();
            rightOperand = operand.pop();
            leftOperand = operand.pop();

            operatorNode.setRightNode(rightOperand);
            operatorNode.setLeftNode(leftOperand);

            operand.push(operatorNode);
        }
        if (!operand.isEmpty()) {
            root = operand.pop();
        }
    }

    public void prefix() {
        prefixHelper(root);
        System.out.println();
    }

    public void infix() {
        infixHelper(root);
        System.out.println();
    }

    public void postfix() {
        postfixHelper(root);
        System.out.println();
    }

    public void prefixHelper(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getData() + " ");
            prefixHelper(localRoot.getLeftNode());
            prefixHelper(localRoot.getRightNode());
        }
    }

    public void infixHelper(TreeNode localRoot) {
        if (localRoot != null) {
            infixHelper(localRoot.getLeftNode());
            System.out.print(localRoot.getData() + " ");
            infixHelper(localRoot.getRightNode());
        }
    }

    public void postfixHelper(TreeNode localRoot) {
        if (localRoot != null) {
            postfixHelper(localRoot.getLeftNode());
            postfixHelper(localRoot.getRightNode());
            System.out.print(localRoot.getData() + " ");
        }
    }

    private boolean isOperator(char x) {
        return x == '+' || x == '-' || x == '*' || x == '/' || x == '^';
    }

    private boolean isOperand(char x) {
        return (x >= '0' && x <= '9') || (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z');
    }
}
