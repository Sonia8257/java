import java.util.Scanner;
class UserException extends Exception
{
	UserException (int a)
	{
		
		System.out.println("your luggage contains extra weight of"+(a-20)+"kg");
		
	}
}
	
public class UserDefinedExcepption
{
	
 static void  disp(int w) throws UserException
{
	
		if (w>20)
		
        throw new UserException(w);
		
		else
			System.out.println("your luggage is on correct weight please drop it here");
		
	}





	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER YOUR LUGGAGE WEIGHT : ");
		int w = s.nextInt();
		{
		try 
		{ 
			disp(w);
		}
		catch(UserException e)
		{
			System.out.println(w);
		}
		finally
		{
			System.out.println("HAVE A GREAT FLIGHT EXPERIENCE");
			
		}
		s.close();
	}
	}
}


