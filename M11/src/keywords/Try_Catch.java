package keywords;

public class Try_Catch {

	public static void main(String[] args)
	{
		System.out.println("Aish is best");			//normal
		//no flow contral statment
		try 
		{
			System.out.println(05);		//risky code
		}
		
		catch(ArithmeticException e)		//in built Exception class--------> e is the object
		{
			System.out.println(e);
		}
		System.out.println("Maths is dirty");
		

	}

}
