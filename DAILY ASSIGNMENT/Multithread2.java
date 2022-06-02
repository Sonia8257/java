public class Multithread2 extends Thread {
	public void run()
	{
		System.out.println("Threads invoke..");
		
	}
	
	

	public static void main(String[] args) {
		 Multithread2 m=new  Multithread2();
		 
		 m.start();
		 m.setName("process");
		 
		 System.out.println("The name of thread is:"+m.getName());
		 System.out.println("The name of thread is:"+m.getId());
		 System.out.println("The thread m priority is:"+m.getPriority());
		
		
		
		
	}

}
