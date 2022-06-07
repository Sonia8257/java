package executor;

public class Destroytest extends Thread
{
	public Destroytest(String string, ThreadGroup t1) {
	start();
	
	}

	public void run()
	{
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			System.out.println("EXCEPTION OCCURS");
		}
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) 
	{
		ThreadGroup t1 = new ThreadGroup("FIRST THREAD");//object for main class of thread
		ThreadGroup t2 = new ThreadGroup(t1,"SECONG THREAD"); 
		
		Destroytest d = new Destroytest("thread1",t1);
		Destroytest d1 = new Destroytest("thread2",t1);//subclass object group
		t1.destroy();
		 
		d.start();
		d1.start();
		
		

	}

}
