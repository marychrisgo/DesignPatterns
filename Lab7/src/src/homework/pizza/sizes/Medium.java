package homework.pizza.sizes;

import homework.pizza.Pizza;
import homework.pizza.PizzaDecorator;

public class Medium extends PizzaDecorator {

    public Medium(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return "Medium " + pizza.getDescription() + "\t\t\t\t" + getBaseCost();
    }

    @Override
    public Double getBaseCost() {
        return 360.00;
    }
}
