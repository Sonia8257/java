public class Multithread3 extends Thread {
	public void run()
	{
		System.out.println("Threads invoke..");
		
	}
	
	

	public static void main(String[] args) {
		 Multithread3 m=new  Multithread3 ();
		 Multithread3 m1=new  Multithread3 ();
		 
		 m.start();
		 m1.start();
		 m.setName("process1");
		 m1.setName("process2");
		 
		 System.out.println("The name of thread is:"+m.getName());
		 System.out.println("The name of thread is:"+m.getId());
		 System.out.println("The thread m priority is:"+m.getPriority());
		 System.out.println("The name of thread is:"+m1.getName());
		 System.out.println("The name of thread is:"+m1.getId());
		 System.out.println("The thread m priority is:"+m1.getPriority());
		 m.setPriority(Thread.MAX_PRIORITY);
		
}
}
