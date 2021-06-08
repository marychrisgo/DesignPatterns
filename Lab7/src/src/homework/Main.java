package homework;

import homework.pizza.Pizza;
import homework.pizza.sizes.Large;
import homework.pizza.sizes.Medium;
import homework.pizza.sizes.Small;
import homework.pizza.toppings.*;
import homework.pizza.types.DeepDishPizza;
import homework.pizza.types.NewYorkPizza;

public class   Main {
    public static void main(String[] args) {
        Pizza pizza = new Small(new DeepDishPizza());
        System.out.println(pizza);

        System.out.println("");
        System.out.println("");
        System.out.println("");

        Pizza pizza2 = new WhiteSauce(new TomatoSauce(new Basil(new Garlic(new Mozzarella(new Large(new DeepDishPizza()))))));
        System.out.println(pizza2);

        System.out.println("");
        System.out.println("");
        System.out.println("");

        Pizza pizza3 = new Mozzarella(new Mozzarella(new Garlic(new Medium(new NewYorkPizza()))));
        System.out.println(pizza3);
    }

}
