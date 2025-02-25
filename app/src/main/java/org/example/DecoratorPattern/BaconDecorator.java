package org.example.DecoratorPattern;

public class BaconDecorator extends BurgerDecorator {
    
    public BaconDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String print() {
        return this.decoratedBurger.print() + " with bacon";
    }

    @Override
    public int cost() {
        return this.decoratedBurger.cost() + 5;
    }
    
}
