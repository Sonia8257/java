//program to test yield method
package executor;

public class Yieldclass extends Thread {
	public void run() // run to chnage the status of thread frm start to run
	{
		System.out.println("current thread  :"+Thread.currentThread().getName());
	}
 public static void main (String [] args)
 {
	 Yieldclass y = new Yieldclass();
	 Yieldclass y1 = new Yieldclass(); 
	 //start to execute the threads
 y.start();
 y1 .start();
 


	y1.yield(); 
	System.out.println("thread in execution mode :"+Thread.currentThread().getName());

}
}
