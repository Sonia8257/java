package executor;

public class Join extends Thread 
{
	public void run()
	{
		for (int i =0;i<=10;i++)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(Exception a)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) throws SecurityException
	{
		Join j = new Join();
		Join j1 = new Join();
		j.start();
		j1.start();
		try
		{
			j.join();
		}
		catch(Exception a)
		{
			System.out.println(a);
		}

	}

}
