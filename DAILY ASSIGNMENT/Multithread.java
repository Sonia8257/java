 // write a program using sleep in threading method
public class Multithread extends Thread {
	public void run()
	{
		for(int i=1;i<10;i++)
	
	{
		try
		{
			
		
		Thread.sleep(100);
	}
		catch(InterruptedException e)
	
	{
			System.out.println(e);
	}
		System.out.println(i);
		
	}
	}

	public static void main(String[] args) {
		 Multithread m=new  Multithread ();
		 Multithread m1=new  Multithread ();
		 m.start();
		
		
		
	}

}






		
		
		
	

