package org.example.DecoratorPattern;

public abstract class BurgerDecorator implements Burger {
    
    protected Burger decoratedBurger;

    public BurgerDecorator(Burger burger) {
        this.decoratedBurger = burger;
    }

    @Override
    public String print() {
        return decoratedBurger.print();
    }

    @Override
    public int cost() {
        return decoratedBurger.cost();
    }


}
