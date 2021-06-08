package homework.pizza.toppings;

import homework.pizza.Pizza;
import homework.pizza.PizzaDecorator;

public class Mozzarella extends PizzaDecorator {

    public Mozzarella(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "\n" + "\textra mozzarella\t\t\t\t" + getBaseCost();
    }

    @Override
    public Double getBaseCost() {
        return 50.00;
    }
}
