class BST {
    Node root;

    
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    
    BST() {
        root = null;
    }

    
    void insert(int key) {
        root = insertRec(root, key);
    }

    
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    
    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null)
            return false;

        if (root.key == key)
            return true;

        if (root.key > key)
            return searchRec(root.left, key);

        return searchRec(root.right, key);
    }

    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Is 40 in the tree? " + tree.search(40)); 
        System.out.println("Is 25 in the tree? " + tree.search(25)); 
    }
}
