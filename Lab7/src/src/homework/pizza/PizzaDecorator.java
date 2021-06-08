package homework.pizza;

public abstract class PizzaDecorator extends Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Double getCost() {
        return pizza.getCost() + getBaseCost();
    }

    public abstract Double getBaseCost();
}
