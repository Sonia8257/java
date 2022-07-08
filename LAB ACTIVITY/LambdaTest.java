//implemntation of method using lambda
package executor;

//creating a interface class
interface My
{
	//void disp();
	//int show(int a);
    int display(int a, int b, int c);
}


public class LambdaTest {

	public static void main(String[] args) {
		
		//lambda expression
		My m=(a,b,c)-> (a+b*c);
		{
		
			System.out.println("the value is "+m.display(20,10,30));
			
		};
		
		
       
	}

}
