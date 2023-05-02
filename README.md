# AVL Tree

This is a Java implementation of an AVL tree. An AVL tree is a self-balancing binary search tree that maintains a balanced tree by performing rotations when a node is inserted or deleted.

## Prerequisites

- Java Development Kit (JDK) version 8 or later

## How to Use

1. Clone this repository: `git clone https://github.com/username/repo.git`
2. Navigate to the project directory: `cd repo`
3. Compile the program: `javac AVLTree.java`
4. Run the program: `java AVLTree`

## Functionality

The AVLTree class provides the following functionality:

- `insert(T value)`: Inserts a value into the AVL tree.
- `delete(T value)`: Deletes a value from the AVL tree.
- `inorder()`: Prints the values of the AVL tree in inorder traversal.

## Methods

The AVLTree class provides the following methods:

- `insert(Node node, T value)`: Inserts a value into the AVL tree starting at the specified node.
- `delete(Node node, T value)`: Deletes a value from the AVL tree starting at the specified node.
- `findMin(Node node)`: Finds and returns the minimum value in the AVL tree starting at the specified node.
- `rotateLeft(Node node)`: Performs a left rotation at the specified node and returns the new root of the subtree.
- `rotateRight(Node node)`: Performs a right rotation at the specified node and returns the new root of the subtree.
- `getBalance(Node node)`: Returns the balance factor of the specified node.
- `height(Node node)`: Returns the height of the specified node.

## Example

```java
AVLTree<Integer> tree = new AVLTree<Integer>();

tree.insert(10);
tree.insert(20);
tree.insert(30);
tree.insert(40);
tree.insert(50);

tree.delete(30);

tree.inorder(); // Prints: 10 20 40 50
