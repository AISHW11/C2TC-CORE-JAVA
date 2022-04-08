package traning;
import java.util.*;
import java.util.stream.Stream;

public class StreamAndLambda {

	public static void main(String[] args) {
		
		
		List<Integer> org=List.of(12,43,65,78,56,76,98,12,10,45,76);
		
		
		//conventional way of programming
		
		System.out.println(org);
		
		/*List<Integer> evenList=new ArrayList<Integer>();
		for (Integer i:orig)
		{
			if(i%2==0)
			{
				evenList.add(i);
			}
		}
		System.out.println(evenList);*/
		
		Stream<Integer> stream=org.stream();
		List<Integer> l=stream.filter(i->i<33).collect(Collectors.toList());
		System.out.println(l);
		
		long fail=l.stream().filter(i->i<33).count();
		System.out.println(fail);
		
		List<Integer> updateList=org.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updateList);
		
	}

}
