package executor;

public class Activecount extends Thread {
	

	public Activecount(String string, ThreadGroup th) {
		super(th,string);
		start();
	}
public void run()
{
	System.out.println(Thread.currentThread().getName());
}
	public Activecount(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 
		ThreadGroup th = new ThreadGroup("Threadgroup body");
		
		
		Activecount a = new  Activecount("First thread",th);
		 Activecount a1 = new  Activecount("second thread",th);
		 System.out.println("the number of active threads are :"+th.activeCount());
		 
	
	}

}
