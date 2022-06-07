package executor;

public class Alivetest extends Thread
{
 public void run()
 {
	 try 
	 {
		 Thread.sleep(500);//used to execute the statement after 500 millesec
		 System.out.println("check whether the thread is alivee or not");
	 }
	 catch(InterruptedException b)
	 {
		 
	 }
 }
	public static void main(String[] args) {
		
Alivetest a = new Alivetest();
System.out.println("Thread status :"+a.isAlive()); //only after the start the execution of thread the threads be going on
a.start();
System.out.println("Thread status :"+a.isAlive()); //thread is alive afternstart start method
	}

}
