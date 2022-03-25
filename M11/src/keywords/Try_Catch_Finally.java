package keywords;

public class Try_Catch_Finally {

	public static void main(String[] args) 
	{
			int[] arr = new int[4];		//size is 4.....indices-0,1,2,3.
			try
			{
				int i = arr[4];		//no index 4 is available..Risky code
				
				System.out.println("Inside try block");
			}
			
			catch(ArrayIndexOutOfBoundsException ex) 
			{
				System.out.println("Exception caught in catch block");		//handing code
			}
			
			finally 
			{
				System.out.println("finally block executed");
			}
			
			System.out.println("Outside try-catch-finally clause");

	}

}
