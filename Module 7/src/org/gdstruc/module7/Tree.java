package org.gdstruc.module7;

public class Tree {
    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public void traverseInOrderDescending() {
        if (root != null) {
            root.traverseInOrderDescending();
        }
    }

    public Node get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return  null;
    }
    public Node getMin()
    {
        Node current = root;
        if (current != null)
        {
            while(current.getLeftChild() != null)
            {
                current = current.getLeftChild();
            }
        }
        System.out.println("Minimum Value: " + current);
        return current;
    }

    public Node getMax()
    {
        Node current = root;
        if (current != null)
        {
            while(current.getRightChild() != null)
            {
                current = current.getRightChild();
            }
        }
        System.out.println("Maximum Value: " + current);
        return current;
    }
}