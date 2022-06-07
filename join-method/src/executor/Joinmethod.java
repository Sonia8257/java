package executor;

public class Joinmethod extends Thread
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
		 Joinmethod j = new  Joinmethod();
		 Joinmethod j1 = new Joinmethod();
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
