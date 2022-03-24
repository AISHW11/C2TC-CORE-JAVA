package keywords;

public class Method_Overloading {
	
	public void m()	//signature is not same..method name + parameters 
	{
	System.out.println("No arguments method");	
	}
	public void m( int i) 
	{
		System.out.println("Integer arguments method");
	}
	
	public void m(double d) 
	{
		System.out.println("Double arguments method");
	}

	public static void main(String[] args)
	{
		Method_Overloading obj=new Method_Overloading ();
		obj.m(); //exact match
		
		obj.m(2);
		
		obj.m(4.67);
	}

}
