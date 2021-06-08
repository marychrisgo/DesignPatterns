package homework.pizza.sizes;

import homework.pizza.Pizza;
import homework.pizza.PizzaDecorator;

public class Small extends PizzaDecorator {

    public Small(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return "Small " + pizza.getDescription() + "\t\t\t\t" + getBaseCost();
    }

    @Override
    public Double getBaseCost() {
        return 200.00;
    }
}
