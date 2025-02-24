package org.example.ObserverPattern;

public class CellUser implements Subscriber {
    
    int cellNumber_;

    public CellUser(int cellNumber) {
        cellNumber_ = cellNumber;
    }

    public void update() {
        System.err.println("Send text to user "  + cellNumber_);
    }
    
}
