package Compositeex1;

public abstract class PathItem {
    private String name;

    protected PathItem(String nameP) {
        name = nameP;
    }

    protected String getName() {
        return name;
    }

    public abstract void add(PathItem obj);
    public abstract void ls();
}
