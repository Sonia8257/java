//accept marks of students (5 sub) and display
average of marks
class AverMark{
public static void main (String [] args)
{
int m1,m2,m3,m4,m5;
Scanner sc = new Scanner (System.in);
System.out.println("Enter five subject marks: ");
m1=sc.nextIn();
m2=sc.nextIn();
m3=sc.nextIn();
m4=sc.nextIn();
m5=sc.nextIn();
int avg = (m1+m2+m3+m4+m5)/5;
System.out.println("AVERAGE OF FIVE SUBJECTS IS   "+avg);
}
}
}