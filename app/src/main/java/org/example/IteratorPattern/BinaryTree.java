package org.example.IteratorPattern;

import java.util.Iterator;

public class BinaryTree implements Tree {

    private BinaryNode root;

    public BinaryTree(BinaryNode root) {
        this.root = root;
    }

    @Override
    public Iterator<BinaryNode> createInOrderIterator() {
        return new InOrderIterator(root);
    }

    @Override
    public Iterator<BinaryNode> createPostOrderIterator() {
        return new PostOrderIterator(root);
    }

    public void setRoot(BinaryNode root) {
        this.root = root;
    }

    public BinaryNode getRoot() {
        return root;
    }
}
