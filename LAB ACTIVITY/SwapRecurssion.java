package swapusingrecursion;
import java.util.Scanner;
public class SwapRecurssion {
int swap(int x, int y)
{
	int temp;
	temp=x;
	x=y;
	y=temp;
	System.out.println("Numbers after swapping : "+x+ "&" +y);
	return swap(x,y);
}
	
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		System.out.println("Numbers before swapping : "+a+ "&" +b);
		
		SwapRecurssion r = new SwapRecurssion();
		r.swap(a,b);

	}

}
