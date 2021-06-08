package homework.pizza.types;

import homework.pizza.Pizza;

public class NewYorkPizza extends Pizza {
    @Override
    public String getDescription() {
        return "New York Pizza";
    }

    @Override
    public Double getCost() {
        return 0.00;
    }
}
