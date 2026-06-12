public class BinaryTree {

    private Node root;

    public BinaryTree(){
        this.root = null;
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

    public Integer getRoot(){
        if (root == null)
            return null;
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

    private Node findNode(int value){
        if (root.getValue() == value){
            return root;
        }
        else {
            return _findNode(value, root);
        }
    }

    private Node _findNode(int value, Node node){
        if (node == null){
            return null;
        }
        if (value == node.getValue()){
            return node.getValue();
        } else if (value > node.getValue()) {
            return _binarySearch(value, node.right);
        } else if (value < node.getValue()) {
            return _binarySearch(value, node.left);
        }
        else {return null;}
    }

    public boolean contains(int value){
        return findNode(value) != null;
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

    public void postOrder(){
        if (root != null){
            _postOrder(root);
        }
    }

    private void _postOrder(Node node){
        if (node != null){
            _postOrder(node.left);
            _postOrder(node.right);
            System.out.println(node.getValue());
        }
    }

}
