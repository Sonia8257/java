
public class Multithread4 extends Thread {
	public void run()
	{
		System.out.println("Threads invoke.."+Thread.currentThread().getPriority());
		
	}
	
	

	public static void main(String[] args) {
		 Multithread4 m=new  Multithread4 ();
		 
		 
		 
		 m.setPriority(Thread.MIN_PRIORITY);
		 m.start();
		
		
		
		
	}

}
