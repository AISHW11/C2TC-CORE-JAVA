package traning;

import java.util.Scanner;

public class AddTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("eneter the finumber 1");
		int number1 = reader.nextInt();
		
		System.out.println("eneter the second 2");
		int number2 = reader.nextInt();
		
		int total=number1 + number2;
		System.out.println("total value; "+total);

	}

}
