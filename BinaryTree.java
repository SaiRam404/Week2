
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

   
    void inorderTraversal(Node node) {
        if (node == null)
            return;

        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    
    void preorderTraversal(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

 
    void postorderTraversal(Node node) {
        if (node == null)
            return;

        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    void inorder() {
        inorderTraversal(root);
    }

    void preorder() {
        preorderTraversal(root);
    }

    
    void postorder() {
        postorderTraversal(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal:");
        tree.inorder();

        System.out.println("\nPreorder traversal:");
        tree.preorder();

        System.out.println("\nPostorder traversal:");
        tree.postorder();
    }
}
