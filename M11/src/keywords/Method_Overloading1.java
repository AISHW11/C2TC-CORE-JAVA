package keywords;

public class Method_Overloading1 {
	
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
	/*	obj.m(); //exact match
		
		obj.m(2);
		
		obj.m(4.67);*/
		//Tell the output
		
		obj.m('a'); //Integer
		obj.m(2); //Integer
		obj.m(101); //double
		obj.m(5.6f); //double
	}

}
