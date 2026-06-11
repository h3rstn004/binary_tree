public class Node {

    private int value;
    Node right;
    Node left;

    public Node(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public int getValue() {
        return value;
    }
}