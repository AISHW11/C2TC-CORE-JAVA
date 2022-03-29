package traning;
import java.util.*;

public class CustomizedException {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age...");
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		
		
		if(age<18) 
		{
			throw new CantVote("You cannot cast your Vote as age is less then 18...");
		}
		else 
		{
			System.out.println("You can vote.....");
		}
			}

}
