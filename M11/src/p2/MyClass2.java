package p2;
import p1.*;

//This Class is having default access modifier
public class MyClass2 
{

	public static void main(String args[]) 
	{
		//accessing class MyClass from package p1
		MyClass1 obj = new MyClass1();
		
		obj.display();
	}

}
