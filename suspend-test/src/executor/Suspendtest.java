package executor;

//program for suspending resuming and stoping a thread
public class Suspendtest extends Thread 
{
	 public void run()
	 {
	
			 System.out.println(Thread.currentThread().getName());
			 
	 }

	public static void main(String[] args) {
		Suspendtest s = new Suspendtest();
		Suspendtest s1 = new Suspendtest();
		s.start();
		s1.start();
		s.suspend(); // temporarily suspended or making thread 0 flase or not to execute
		//after suspending thread 0 and  if we want to resume from the suspend 
		s.resume();
		//if you want to permanently stop the execution of particular thread use stop() and it can not be resumed
		s.stop();
		s.resume();// resuming after stop () used on thread 0

	}

}
