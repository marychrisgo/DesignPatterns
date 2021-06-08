package visitor;

public class Blue extends Color {
    public void count()
    {
        ++s_num_blue;
    }
    public void call()
    {
        eye();
    }
    public void eye()
    {
        System.out.println("Blue.eye");
    }
}
