package visitor;

public class Main {

    public static void main(String[] args) {
        Color set[] =
        { new Red(), new Blue(), new Blue(), new Red(), new Red() };
        for (Color c : set)
        {
            c.count();
            c.call();
        }
        Color.reportNum();
    }
}
