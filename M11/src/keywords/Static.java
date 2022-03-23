package keywords;

public class Static {
	
	String name;	//object bound
	int adhar;		//object bound
	static String vaccine="Covind-Shield";		//class bound Memory management

	public Static(String name, int adhar) 
	{		
		this.name = name;
		this.adhar = adhar;
	}
	//STTAIC METHOD
	static void change() 
	{
		vaccine="Co-vaccine";
	}
	
	void display() 
	{
		System.out.println(name+" "+adhar+" "+vaccine);
	}
	
	public static void main(String[] args) {
		Static.change();
		Static p1=new Static("Aish",985474);
		
		Static p2=new Static("Raju",6474545);
		
		p1.display();
		p2.display();
	}

}
