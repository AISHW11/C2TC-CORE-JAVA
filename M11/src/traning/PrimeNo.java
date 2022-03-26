package traning;


public class PrimeNo {

	public static void main(String[] args) {
		 int num=29;
		 boolean flag=false;
		 for (int i = 2; i <= num / 2; ++i)
		 {
			 //condition for non prime no
			 if(num % i== 0)
			 {
				 flag = true;
				 break;
			 }
		 }

		 if (!flag)
			 System.out.println(num + " is a prine no");
		 else
			 System.out.println(num + " is not a prine no");
	}
}
