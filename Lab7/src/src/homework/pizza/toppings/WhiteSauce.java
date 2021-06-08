package homework.pizza.toppings;

import homework.pizza.Pizza;
import homework.pizza.PizzaDecorator;

public class WhiteSauce extends PizzaDecorator {

    public WhiteSauce(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "\n" + "\textra white sauce\t\t\t\t" + getBaseCost();
    }

    @Override
    public Double getBaseCost() {
        return 25.00;
    }
}
