package traning;
import java.io.*;

public class Rightstar {

	//function to demonstrate pattern
	public static void StarRightTriangle(int n)
	{
		int a,b;
		
		//outer loop to handle no of rows
		//k in this case
		for (a = 0; a < n; a++) {
			
			//inner loop to handle no of columns
			//values changing  to outer loop
			for (b = 0; b <= a; b++) {
				
				//printing stars
				System.out.print(" * ");
			}
			//end line
			System.out.println();
			
			}
	}
	//driver function
	public static void main(String args[])
	{
		int k = 5;
		StarRightTriangle(k);
	}
	}
		
		
	


