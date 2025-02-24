package org.example.IteratorPattern;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class InOrderIterator implements Iterator<BinaryNode> {

    private Stack<BinaryNode> stack = new Stack<>();

    public InOrderIterator(BinaryNode root) {
        pushLeftNodes(root); 
    }

   
    private void pushLeftNodes(BinaryNode node) {
        while (node != null) {
            stack.push(node);
            node = node.getLeft();
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

        BinaryNode currentNode = stack.pop();


        pushLeftNodes(currentNode.getRight());

        return currentNode;
    }
}