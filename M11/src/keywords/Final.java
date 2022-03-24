package keywords;

public class Final {

	public static void main(String[] args) {
		
		//Parent p=new Parent();
		//p.marry();
		
		Child c=new Child();
		c.marry();

	}

}
class Parent
{
	void property() 
	{
		System.out.println("House....Plot....Money...Car");
	}
	void marry() 
	{
		System.out.println("Lata");
	}
}

class Child extends Parent
{
	void marry()	//...method Overriding---Giving new implememtation
	{
		System.out.println("Aish");
	}
}