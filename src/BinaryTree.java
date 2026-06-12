public class BinaryTree {

    private Node root;

    public BinaryTree(int newValue){
        this.root = new Node(newValue);
    }

    public void addNode(int newValue){
        if(this.root == null){
            this.root = new Node(newValue);
        }
        else{
            _addNode(this.root, newValue);
        }
    }

    private void _addNode(Node node, int newValue){
        if(newValue > node.getValue()){
            if(node.right == null){
                node.right = new Node(newValue);
            }
            else{
                _addNode(node.right, newValue);
            }
        } else if (newValue < node.getValue()) {
            if(node.left == null){
                node.left = new Node(newValue);
            }
            else{
                _addNode(node.left, newValue);
            }
        } else if (newValue == node.getValue()) {
            System.out.println("Value already exists");
        }
    }

    public int getRoot(){
        return root.getValue();
    }

    public void inOrder(){
        if(this.root != null){
            _inOrder(this.root);
        } else {
            System.out.println("No node");
        }
    }

    private void _inOrder(Node node){
        if(node != null){
            _inOrder(node.left);
            System.out.println(node.getValue());
            _inOrder(node.right);
        }
    }

    public Integer binarySearch(int value){
        if (root.getValue() == value){
            return root.getValue();
        }
        else {
            return _binarySearch(value, root);
        }
    }

    private Integer _binarySearch(int value, Node node){
        if (value == node.getValue()){
            return node.getValue();
        } else if (value > node.getValue()) {
            return _binarySearch(value, node.right);
        } else if (value < node.getValue()) {
            return _binarySearch(value, node.left);
        }
        else {return null;}
    }

    public void preOrder(){
        if (root != null){
            _preOrder(root);
        }
    }

    private void _preOrder(Node node){
        if (node != null){
            System.out.println(node.getValue());
            _preOrder(node.left);
            _preOrder(node.right);
        }
    }

}
