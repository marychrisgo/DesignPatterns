package singleton;

public class TestSingleton {
	public static void foo()
	{
	  // Initialization on first use
	  if (GlobalClass.global_ptr == null)
		  GlobalClass.global_ptr = new GlobalClass();
	  GlobalClass.global_ptr.set_value(1);
	  System.out.println("foo: global_ptr is " + GlobalClass.global_ptr.get_value() + ", and the instance is: "+GlobalClass.global_ptr + "\n");
	}
	
	public static void bar()
	{
	  // Initialization on first use
	  if (GlobalClass.global_ptr == null)
		  GlobalClass.global_ptr = new GlobalClass();
	  GlobalClass.global_ptr.set_value(2);
	  System.out.println("bar: global_ptr is " + GlobalClass.global_ptr.get_value() + ", and the instance is: "+GlobalClass.global_ptr + "\n");
	}
	
	public static void main(String[] args) {
		if (GlobalClass.global_ptr == null)
			GlobalClass.global_ptr = new GlobalClass();
		System.out.println("main: global_ptr is " + GlobalClass.global_ptr.get_value() + ", and the instance is: "+GlobalClass.global_ptr + "\n");
		foo();
		bar();
	}
	
}
