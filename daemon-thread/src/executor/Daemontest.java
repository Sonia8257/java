package executor;

public class Daemontest extends Thread
{ 
	public void run()
	{
		//check if there is daemon thread
		if(Thread.currentThread().isDaemon())
		{
			
			System.out.println("daemon thread is executed");
		}
		else
		{
			System.out.println("user defined thread gets executed");
	}
	}

	public static void main(String[] args) {
		//creating objects for mainclass
		Daemontest d = new Daemontest();
		Daemontest d1 = new Daemontest();
	
		
		d.start();    //call start
		
		// to make normal thread as daemon threat
		
		d1.setDaemon(true);
		d1.start();

	}

}
