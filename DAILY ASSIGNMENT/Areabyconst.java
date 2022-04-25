class Areabyconst{
int width;
int length;
int area;
void disp()
{

System.out.println("Area of the rectangle for length   "  +length+ " and width    " +width+ "  is  "  +area);
}
Areabyconst(int w ,int l)
{
width = w;
length = l;
area = w*l;
}
public static void main (String [] args)
{

Areabyconst a1 = new Areabyconst(85,60);
a1.disp(); 
}
}

