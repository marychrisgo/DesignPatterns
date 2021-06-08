package homework.pizza.types;

import homework.pizza.Pizza;

public class NeapolitanPizza extends Pizza {
    @Override
    public String getDescription() {
        return "Neapolitan Pizza";
    }

    @Override
    public Double getCost() {
        return 0.00;
    }
}
