import java.util.*;

public class UtilPack {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your age :");
	int a = s.nextInt();
	int b[] = {5,10,9,3};
	Arrays.sort(b);
	System.out.println("YOUR LUCKY NUMBERS ARE:"+Arrays.toString(b));
	}

}
