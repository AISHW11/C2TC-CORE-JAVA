package traning;

public class Generics {

	public static void main(String[] args) {
	Cont<Float> obj1=new Cont<>();
	obj1.value=2.5f;
	
	obj1.show();
	
	}
	
	

}
class Cont<T>
{
	T value;   //int value....float value
	void show() {
		System.out.println(value.getClass().getName());
	}
}