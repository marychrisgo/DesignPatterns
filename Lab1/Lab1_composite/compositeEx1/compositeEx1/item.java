package compositeEx1;

public abstract class item {
    protected String name;
    public abstract void ls();
    public void add(Item obj){};
    public void remove(Item obj) {};
    // For full composite implementation, we add getChildren too
}
