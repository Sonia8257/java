 package executor;
class TestThread implements Runnable
{
	int total;
	public void run()
	{
		
		for(int i=1;i<100;i++)
		{
			total = total+i;
			if(total>100)
			{
				synchronized(this)
				{
					notify();
				}
			}
			try
			{
				Thread.sleep(50);
				
			}catch(InterruptedException e)
			{
				
			}
			
			System.out.println("Main method creates total : "+total);	
		}
	}
}
public class ThreadCommunication {
	public static void main (String [] args)
{
 TestThread test = new TestThread();
 Thread t = new Thread(test);
 t.start();
try
{
	synchronized(test)
	{
		test.wait();
		
	}
}
	catch(InterruptedException e)
	{
		
	}

System.out.println("Main method creates total : "+test.total);
}

}
