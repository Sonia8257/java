abstract class Arithmet
{
abstract public void add();


 int a = 3;
int b = 3;
}
class Add extends Arithmet
{
public void add()
{
System.out.println("a + b = " +(a+b));
}
}
class Sub extends Add
{
public void sub()
{
System.out.println("a - b = " +(a-b));
}
}
class Mul extends Sub
{
public void mul()
{
System.out.println("a * b = " +(a*b));
}
}
class Div extends Mul
{
public void div()
{
System.out.println("a / b = " +(a/b));
}
}
class Mod extends Div
{
public void mod()
{
System.out.println("a % b = " +(a%b));
}
}
public class Operation
{
public static void main (String [] args)
{
Mod m = new Mod();
m.add();
m.sub();
m.mul();
m.div();
m.mod();
}
}
