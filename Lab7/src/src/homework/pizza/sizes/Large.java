package homework.pizza.sizes;

import homework.pizza.Pizza;
import homework.pizza.PizzaDecorator;

public class Large extends PizzaDecorator {

    public Large(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return "Large " + pizza.getDescription() + "\t\t\t\t" + getBaseCost();
    }

    @Override
    public Double getBaseCost() {
        return 720.00;
    }
}
