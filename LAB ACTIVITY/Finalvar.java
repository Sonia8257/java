package finaldatamember;
final  class Finalvariable
{
	final void disp()
	{
		System.out.println("child is executed");
	}
}
class Method extends Finalvariable
{
void disp()
{
	System.out.println("child");
	
}
}

	public class Finalvar
	{
		
	
		public static void main(String [] args)
{
	Method m = new Method();
	m.disp();
}

}
