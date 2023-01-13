import java.util.ArrayList;

public class Node {
    private int data;

    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;

        this.left = null;
        this.right = null;
    }

    public Node(int data, Node left, Node right) {
        this.data = data;

        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void insert(int data) {
        if (data > this.data) {
            if (right == null) {
                right = new Node(data);
                return;
            }
            right.insert(data);
        } else {
            if (left == null) {
                left = new Node(data);
                return;
            }
            left.insert(data);
        }
    }

    public ArrayList<Integer> sort() {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        inorder(this, ret);
        return ret;
    }

    public void inorder(Node node, ArrayList<Integer> in) {
        if (node.left != null)
            inorder(node.left, in);

        in.add(node.getData());

        if (node.right != null)
            inorder(node.right, in);
    }
}
