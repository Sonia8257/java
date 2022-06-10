package executor;
import entity.OddEvenThread;

public class Mainclass {

	
	public static void main(String[] args) 
	{
		OddEvenThread o = new OddEvenThread();
        
        
          Thread t1=new Thread(new Runnable()
{
  
            public void run() {
                o.Even();
 
            }
        });
        
         Thread t2=new Thread(new Runnable()
{  
            public void run() {
                o.Odd();
 
            
        }
 });
        t1.start();
        t2.start();
 
	}
}