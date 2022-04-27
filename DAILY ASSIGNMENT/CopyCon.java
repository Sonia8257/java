class CopyCon{
int emp_id;
String emp_name;
CopyCon(int e,String n)
{
emp_id =e;
emp_name = n;
} 
CopyCon(CopyCon s)
{
emp_id=s.emp_id;
emp_name = s.emp_name;
}
void disp()
{
System.out.println(emp_id + "   " +emp_name);
}
public static void main (String [] args)
{
CopyCon c = new CopyCon(1,"tom");
CopyCon c1 = new CopyCon(c);
c.disp();
c1.disp();
}
}