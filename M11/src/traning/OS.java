package traning;
import java.util.*;

public class OS {
	
	private static final String nameOfOs = System.getProperty("os.name");
	
	private static final String versionOfOs = System.getProperty("sun.arch.data.model");

	public static void main(String[] args) 
	{
	
	System.out.println("Name of the operating system is " + nameOfOs);
	System.out.println("Version of the operating system is " + versionOfOs);
	

	}

}
