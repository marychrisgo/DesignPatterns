package homework.pizza.toppings;

import homework.pizza.Pizza;
import homework.pizza.PizzaDecorator;

public class Garlic extends PizzaDecorator {

    public Garlic(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "\n" + "\textra garlic\t\t\t\t\t" + getBaseCost();
    }

    @Override
    public Double getBaseCost() {
        return 10.00;
    }
}
