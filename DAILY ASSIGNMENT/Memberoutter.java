
public class Memberoutter {
	int a =10;
	int b = 20;

	class Memberinner{
		void add () {
			int c = a+b;
			System.out.println("a + b = "+c);
			
		}
	}
		
 public static void main (String [] args)
 {
	 Memberoutter o = new Memberoutter();
	 Memberoutter.Memberinner i = o.new Memberinner();
	 i.add();
 }
}