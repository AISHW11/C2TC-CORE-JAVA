package keywords;

public class Static_1 {
	
	String name;	//object bound
	int adhar;		//object bound
	static String vaccine="Covind-Shield";		//class bound Memory management

	public Static_1(String name, int adhar) 
	{		
		this.name = name;
		this.adhar = adhar;
	}
	
	void display() 
	{
		System.out.println(name+" "+adhar+" "+vaccine);
	}
	
	public static void main(String[] args) {
		Static p1=new Static("Aish",985474);
		
		Static p2=new Static("Raju",6474545);
		
		p1.display();
		p2.display();
	}

}
