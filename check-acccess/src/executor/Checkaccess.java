//program to check the check access method for thread

package executor;

public class Checkaccess extends Thread //create thread by extending thread class
{
	public void run()
	{
		System.out.println("After the execution : "+Thread.currentThread().getName());
				
	}

	public static void main(String[] args) throws SecurityException
	{
		Checkaccess c = new Checkaccess();
		Checkaccess c1 = new Checkaccess();	

		c.start();
		c1.start();
		//checkaccess method 
		c.checkAccess();
		System.out.println("chech whether the thread has access : "+c.getName());
		c1.checkAccess();
		System.out.println("chech whether the thread has access : "+c1.getName());
		
	}

}
