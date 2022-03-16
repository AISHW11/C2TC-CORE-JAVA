package traning;

interface AI
{
	void display_A();
	
}
interface B
{
	void display_B();
}

class AB implements AI,B
{
	public void display_A()
	{
		System.out.println("I am from Interface A.....");
	}
	
	public void display_B()
	{
		System.out.println("I am from Interface B.....");
	}
}
public class Interface1 {
	
	public static void main(String[] args) {
		AB obj=new AB();
		obj.display_A();
		
		obj.display_B();
	}

}