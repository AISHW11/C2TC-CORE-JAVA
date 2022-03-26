package traning;

public class Sum_NaturalNo {

	public static void main(String[] args) {
		
		int num = 100, sum = 0;
		
		for(int i = 2; i <= num; ++i)
		{
			
			//sum = sum + i;
			sum += i;
		}
		System.out.println("Sum = " + sum);
	}

}
