package traning;

import java.util.ArrayList;

public class Collection {

	public static void main(String[] args) {
		ArrayList l=new ArrayList(); //no size..no data type
		
		l.add(56);
		l.add(45.78);
		l.add("M11");
		l.add('a');
		l.add(null);
		
		l.add(2,"aishwarya");
		System.out.println(l);
		
		l.remove(2);
		
		System.out.println(l);
	}
}
