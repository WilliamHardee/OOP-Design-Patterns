package org.example.IteratorPattern;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class PostOrderIterator implements Iterator<BinaryNode> {

    private Stack<BinaryNode> stack = new Stack<>();

    public PostOrderIterator(BinaryNode root) {
        traverse(root); 
    }

  
    private void traverse(BinaryNode node) {
        if (node == null) {
            return;
        }

        Stack<BinaryNode> tempStack = new Stack<>();
        tempStack.push(node);

        while (!tempStack.isEmpty()) {
            BinaryNode current = tempStack.pop();
            stack.push(current); 

          
            if (current.getLeft() != null) {
                tempStack.push(current.getLeft());
            }
            if (current.getRight() != null) {
                tempStack.push(current.getRight());
            }
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public BinaryNode next() {
        if (stack.isEmpty()) {
            throw new NoSuchElementException();
        }

        return stack.pop();
    }
}