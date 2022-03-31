package traning;

public class Multithreding {

	public static void main(String[] args) {
	
		MyThread obj=new MyThread();
		obj.start();
		//main thread
		for(int i=0;i<10;i++);
		{
			System.out.println("I am main Thread...");
			
		}

	}

}
//Thread
class MyThread extends Thread //Runnable interface
{
	//Override the run()
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(" I am MyThread...");
		}
	}
	
}