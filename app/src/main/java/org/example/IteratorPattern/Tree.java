package org.example.IteratorPattern;

import java.util.Iterator;

public interface Tree {

    public Iterator<BinaryNode> createInOrderIterator();
    public Iterator<BinaryNode> createPostOrderIterator();
    
} 
