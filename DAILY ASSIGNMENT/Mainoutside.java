\\ WRITE A PROGRAM BY USING THREAD METHOD :

public class Newthread implements Runnable
{
public void run()
{
System.out.println("THread phase...");
}
public static void main (String args[])
{
Newthread n=new Newthread();
Thread t=new Thread(n);
t.strat();
}
}
class Maininside
{
int id;
}
class Mainoutside
{
public static void main(String args[])
{
Maininside m=new Maininside();
System.out.println(m.id);
}
}