package executor;

public class Interrupttest extends Thread {
	public void run ()
	{
		try
		{
			Thread.sleep(500);//thread is in sleep mood
		}
		catch(InterruptedException a)
		{
	     System.out.println("Exception...");
			
		}
	}




	public static void main(String[] args)
	{
		Interrupttest i = new Interrupttest();
		i.start();
	
		try
		{
			i.interrupt(); // interrupting the thread in sleep mode 
			System.out.println("NO ERROR");
		}catch(Exception a)
		{
			System.out.println("handle the exception" +a);
		}
		}
}