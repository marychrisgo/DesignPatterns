package Compositeex1;

public class File extends PathItem {
    public File(String nameP) {
        super(nameP);
    }

    @Override
    public void add(PathItem obj) {
        throw(new RuntimeException("File can not store any PathItem"));
    }

    @Override
    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + getName());
    }
}