public class Main {
    public static void main(String[] args) {
        AVLTree<Integer> tree = new AVLTree<>();

        // Insert nodes
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        tree.insert(1);
        tree.insert(9);

        // Print inorder traversal
        System.out.println("Inorder traversal:");
        tree.inorder();

        // Delete nodes
        tree.delete(3);
        tree.delete(8);

        // Print inorder traversal
        System.out.println("\nInorder traversal after deletion:");
        tree.inorder();
    }
}

