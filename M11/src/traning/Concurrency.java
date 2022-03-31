package traning;

import java.util.Concurrent.locks.ReentrantLock;

public class Concurrency {

	public static void main(String[] args) {
		ReentrantLock l= new ReentrantLock();
			
		l.lock();
		
		System.out.println(l.isLocked());
		
		l.unlock();
		
		System.out.println(l.isLocked());
		
		System.out.println(l.getQueueLength());
		
		System.out.println(l.isHeldByCurrentThread());
		
		
		
		
		
		
        
	}

}
