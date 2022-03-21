package p3;

public class A 
{
	private void display() 
	{
		System.out.println("TNS Sessions");
		
	}

	class B
	{

	public static void main(String args[])
	{
		A obj = new A();
		//trying to access private method of another class
		obj.display();
	}

	}

}
