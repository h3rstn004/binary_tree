# Binary Search Tree in Java

A **Binary Search Tree (BST)** implementation written in Java for educational purposes. This project demonstrates the use of Object-Oriented Programming (OOP), recursion, and dynamic data structures by implementing a BST from scratch.

## 🚀 Features

The current implementation supports:

* ✅ Creating a Binary Search Tree
* ✅ Inserting new nodes while maintaining BST properties
* ✅ Preventing duplicate values from being inserted
* ✅ In-Order traversal
* ✅ Recursive search for existing values

## 📂 Project Structure

```text
src/
├── BinaryTree.java
└── Node.java
```

* **Node.java**: Represents a node in the tree, storing its value and references to its left and right children.
* **BinaryTree.java**: Implements the core BST operations such as insertion, traversal, and searching.

## 🌳 Binary Search Tree Rules

For every node in the tree:

* Values smaller than the current node are stored in the left subtree.
* Values greater than the current node are stored in the right subtree.
* Duplicate values are not allowed.

Example:

```text
Inserted values: 50, 30, 70, 20, 40, 60, 80

        50
       /  \
     30    70
    / \    / \
   20 40  60 80
```

## 🔍 In-Order Traversal

The In-Order traversal visits nodes in the following order:

1. Left subtree
2. Current node
3. Right subtree

For the example above, the output is:

```text
20
30
40
50
60
70
80
```

Because of the BST property, an In-Order traversal always returns the values in ascending order.

## 🔎 Search Operation

The search algorithm recursively compares the target value with the current node:

* If the value is smaller, continue in the left subtree.
* If the value is greater, continue in the right subtree.
* If both values are equal, the element has been found.

This approach significantly reduces the number of comparisons compared to a linear search.

## 💻 Example Usage

```java
BinaryTree tree = new BinaryTree(50);

tree.addNode(30);
tree.addNode(70);
tree.addNode(20);
tree.addNode(40);
tree.addNode(60);
tree.addNode(80);

tree.inOrder();

Integer result = tree.binarySearch(40);

if (result != null) {
    System.out.println("Value found: " + result);
}
```

## 🧠 Concepts Demonstrated

* Object-Oriented Programming (OOP)
* Encapsulation
* Recursion
* Binary Search Trees (BST)
* Dynamic data structures
* Recursive algorithms
* Tree traversals

## 📈 Planned Improvements

* [ ] Pre-Order traversal
* [ ] Post-Order traversal
* [ ] Node deletion
* [ ] Tree height calculation
* [ ] Node counting
* [ ] Balance checking
* [ ] Generic implementation using `Comparable<T>`
* [ ] Unit tests with JUnit

## 🎯 Purpose

This project was built to strengthen my understanding of Java and data structures by implementing the fundamental operations of a Binary Search Tree without relying on external libraries. It serves as both a learning exercise and a portfolio project demonstrating recursion, object-oriented design, and algorithm implementation.

