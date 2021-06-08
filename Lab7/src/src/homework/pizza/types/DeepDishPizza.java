package homework.pizza.types;

import homework.pizza.Pizza;

public class DeepDishPizza extends Pizza {
    @Override
    public String getDescription() {
        return "Deep Dish Pizza";
    }

    @Override
    public Double getCost() {
        return 0.00;
    }
}
