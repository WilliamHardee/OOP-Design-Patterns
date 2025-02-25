package org.example.DecoratorPattern;

public class CheeseDecorator extends BurgerDecorator {
    
    public CheeseDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String print() {
        return this.decoratedBurger.print() + " with cheese";
    }

    @Override
    public int cost() {
        return this.decoratedBurger.cost() + 2;
    }
}
