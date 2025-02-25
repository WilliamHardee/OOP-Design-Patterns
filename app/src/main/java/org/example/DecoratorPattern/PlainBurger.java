package org.example.DecoratorPattern;

public class PlainBurger implements Burger {
    
    @Override
    public String print() {
        return "A plain burger";
    }

    @Override
    public int cost() {
        return 4;
    }
    
}
