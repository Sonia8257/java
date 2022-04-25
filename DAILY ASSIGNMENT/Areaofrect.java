public class Areaofrect{
int length;
int width;
int area;
void area(int l,int w)
{
length= l;
width = w;
area=w*l;
}
void disp()
{
System.out.println("Area of the rectangle for length   "  +length+ " and width    " +width+ "  is  "  +area);
}
public static void main (String [] args)
{
Areaofrect a1 = new Areaofrect();
Areaofrect a2 = new Areaofrect();
Areaofrect a3= new Areaofrect();

a1.area(20,50);
a2.area(50,50);
a3.area(100,80);
a1.disp();
a2.disp();
a3.disp();
}
}

