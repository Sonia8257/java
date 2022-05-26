import java.io.*;
public class IOpack {

	public static void main(String[] args) {
		Console a = System.console();
		System.out.println("Enter your name :");
		String b = a.readLine();
		System.out.println("Hello : " +b);
		
	}

}
