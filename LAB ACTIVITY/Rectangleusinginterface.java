import java.util.Scanner;
interface Area
{
	 double pi=314;
	 double arearect(double l,double b);
}

class Rect implements Area
{
	public double arearect(double l,double b)
	{
		return (l*b);
		
	}
}



public class Rectangleusinginterface {
	
	public static void main(String[] args) {
		Rect r = new Rect();
		
 Scanner s = new Scanner(System.in);
 System.out.println("ENTER THHE LENGTH AND BREADTH :");
 int l = s.nextInt();
 int b = s.nextInt();
 System.out.println("Area of Rectangle is  "+r.arearect(l,b));
	}

}
