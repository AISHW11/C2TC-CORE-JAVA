package traning;
import java.util.Arrays;
import java.util.List;

public class Wild_Bounded {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		System.out.println(sum(list1));

	}


//sum operation

static double sum(List<? extends Number> list)
{
	double sum=0.0;
	
	for(Number i: list)
	{
		sum+= i.intValue();
	}
	return sum;
	}
}