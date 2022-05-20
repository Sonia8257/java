class CallByRef {

 static void disp(int a )
 {
	
	 a*=10;
	
 }
	public static void main(String[] args) {
	 

		 int s = 15;

	disp(s);
	 System.out.println("CallByRef is " +s);
}
}
