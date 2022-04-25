class ObjTest{
int roll_no;
String stud_name;
String location;
}
public class MainClass{
public static void main (String[] args)
{
System.out.println ( "Rollno Name Location");
ObjTest ob1 = new ObjTest();
ob1.roll_no = 10;
ob1.stud_name = "Tom";
ob1.location = "chennai";
ObjTest ob2 = new ObjTest();
ob2.roll_no = 11;
ob2.stud_name = "zazu";
ob2.location = "Kanchi";
ObjTest ob3 = new ObjTest();
ob3.roll_no = 12;
ob3.stud_name = "simba";
ob3.location = "Hosur";

System.out.println(+ ob1.roll_no + "   " + ob1.stud_name + "  " +ob1.location);
System.out.println(+ ob2.roll_no + "   " + ob2.stud_name + "  " +ob2.location);
System.out.println(+ ob3.roll_no + "   " + ob3.stud_name + "  " +ob3.location);
}
}


 
 
