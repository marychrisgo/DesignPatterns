package compositeEx1;

import java.util.ArrayList;

public class Directory {
    private ArrayList includedFiles = new ArrayList();

    public void add(Object obj) {
        includedFiles.add(obj);
    }
    public void remove(Item obj) { includeFiles.remove(obj);}

    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
        CompositeDemo.compositeBuilder.append("   ");
        for (Object obj : includedFiles) {
            // Recover the type of this object
            String name = obj.getClass().getSimpleName();
            if (name.equals("Directory")) {
                ((Directory)obj).ls();
            } else {
                ((File)obj).ls();
            }
        }
        CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
    }
}
