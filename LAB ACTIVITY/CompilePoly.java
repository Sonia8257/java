package polymorphism;

import java.util.Scanner;

public class CompilePoly {
	void add(int a , int b) {
		int c = a+b;
		System.out.println("SUM IS : "+c);
	}
	void add(int a, int b, int c) {
		int d = a+b+c;
		System.out.println("SUM IS : "+d);
	}

	public static void main(String[] args) {
		 CompilePoly p = new  CompilePoly();
		 Scanner s = new Scanner(System.in);
		 System.out.println("ENTER three NUMBERS : ");
		 int a = s.nextInt();
		 int b = s.nextInt();
		 int c = s.nextInt();
		 p.add(a,b);
		 p.add(a,b,c);

	}

}
