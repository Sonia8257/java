
package entity;

public class OddEvenThread{

	 boolean odd;
	    int tstart = 1;
	    int thread_no = 10;
	 
	    public void Odd() {
	        synchronized (this) {
	            while (tstart < thread_no) {
	                System.out.println("CHECKING FOR ODD THREAD");
	 
	                while (!odd) {
	                    try {
	                        System.out.println("waiting thread : " + tstart);
	                        wait();
	                        System.out.println("Notified odd : " + tstart);
	                    } catch (InterruptedException e) {
	                      
	                    }
	                }
	                System.out.println("ODD THREAD IS  " + tstart);
	                tstart++;
	                odd = false;
	                notify();
	            }
	        }
	    }

public void Even() {
	 
    try {
        Thread.sleep(1000);
} catch (InterruptedException e1) {
       
    }
    synchronized (this) {
        while (tstart < thread_no) 
{
            System.out.println("CHECKING FOR EVEN THREAD");

            while (odd) {
                try {
                    System.out.println("waiting thread : " +tstart);
                    wait();
                    System.out.println("Notified even: " +tstart);
                } catch (InterruptedException e) {
                    
                }
            }
            System.out.println("EVEN THREAD IS  " +tstart);
            tstart++;
            odd = true;
            notify();

        }
    }
}
}
