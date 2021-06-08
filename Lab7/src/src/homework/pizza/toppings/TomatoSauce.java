package homework.pizza.toppings;

import homework.pizza.Pizza;
import homework.pizza.PizzaDecorator;

public class TomatoSauce extends PizzaDecorator {

    public TomatoSauce(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "\n" + "\textra tomato sauce\t\t\t\t" + getBaseCost();
    }

    @Override
    public Double getBaseCost() {
        return 20.00;
    }
}
