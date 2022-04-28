class CopyCon2{
int emp_id;
String emp_name;
CopyCon2(int e,String n)
{
emp_id =e;
emp_name = n;
}
CopyCon2(){
}
void disp()
{
System.out.println(emp_id + "   " +emp_name);
}
public static void main (String [] args)
{
CopyCon2 c = new CopyCon2(1,"tom");
CopyCon2 c1 = new CopyCon2();
c1.emp_id = c.emp_id;
c1.emp_name= c.emp_name;
c.disp();
c1.disp();
}
}