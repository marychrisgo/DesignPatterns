package Compositeex1;

import java.util.ArrayList;

public class Directory extends PathItem {
    private ArrayList<PathItem> includedFiles = new ArrayList();

    public Directory(String nameP) {
        super(nameP);
    }

    @Override
    public void add(PathItem obj) {
        includedFiles.add(obj);
    }

    @Override
    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + getName());
        CompositeDemo.compositeBuilder.append("   ");
        for (PathItem obj : includedFiles) {
            obj.ls();
        }
        CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
    }
}