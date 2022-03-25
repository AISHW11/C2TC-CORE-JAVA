package keywords;

public class Exception {

	public static void main(String[] args) {
		m1();

	}
	
	static void m1() 
	{
		m2(); 	//call
		
	}
	
	static void m2()
	{
		System.out.println("Hello Aish");
	}

}
