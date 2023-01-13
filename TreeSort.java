import java.util.ArrayList;

public class TreeSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> in) {
        // create binary tree with first node as root
        Node root = new Node(in.get(0));
        for (int i : in) {
            root.insert(i);
        }

        return root.sort();
    }

    public static ArrayList<Integer> sort(int[] in) {
        // create binary tree with first node as root
        Node root = new Node(in[0]);
        for (int i : in) {
            root.insert(i);
        }

        return root.sort();
    }
}
