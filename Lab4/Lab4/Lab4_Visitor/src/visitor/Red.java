package visitor;

public class Red extends Color {
    public void count()
    {
        ++s_num_red;
    }
    public void call()
    {
        eye();
    }
    public void eye()
    {
        System.out.println("Red.eye");
    }
}
