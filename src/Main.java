public class Main {
    public static void main(String[] args) {
        BinaryTree new_tree = new BinaryTree(6);
        new_tree.addNode(7);
        new_tree.addNode(5);
        new_tree.addNode(4);
        new_tree.addNode(8);
        new_tree.inOrder();
    }
}
