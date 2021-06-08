package homework.pizza.toppings;

import homework.pizza.Pizza;
import homework.pizza.PizzaDecorator;

public class Basil extends PizzaDecorator {

    public Basil(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "\n" + "\textra basil\t\t\t\t\t\t" + getBaseCost();
    }

    @Override
    public Double getBaseCost() {
        return 15.00;
    }
}
