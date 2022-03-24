package keywords;

public class Final {

	public static void main(String[] args) {

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
		System.out.println("Late");
	}
}

class Child extends Parent
{
	void marry()	//...method Overriding---Giving new implememtation
	{
		System.out.println("Aish");
	}
}