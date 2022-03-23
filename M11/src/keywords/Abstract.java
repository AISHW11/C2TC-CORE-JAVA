package keywords;

public class Abstract {

	public static void main(String[] args) {
		Scooty pepplus=new Scooty();
		pepplus.numberOfwheels();

	}

}
abstract class Vehicle 
{
	abstract void numberOfwheels();
}
class Scooty extends Vehicle
{
	@Override
	void numberOfwheels()
	{
		System.out.println(2);
		
	}
}