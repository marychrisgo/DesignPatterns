package homework.pizza;

public abstract class Pizza {

    public abstract String getDescription();

    public abstract Double getCost();

    @Override
    public String toString() {
        return getDescription() + "\n" +
                "----------------------------------------------" +
                "\n" + "Total Price: \t\t\t\t\t\t" + getCost();
    }
}
