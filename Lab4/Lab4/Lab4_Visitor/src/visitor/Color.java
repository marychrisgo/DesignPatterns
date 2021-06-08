package visitor;

public abstract class Color {
    public abstract void count();
    public abstract void call();
    static void reportNum() {
        System.out.println("Reds " + s_num_red + ", Blues " + s_num_blue);
    }
    protected static int s_num_red=0, s_num_blue=0;

}
