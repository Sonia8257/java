import java.util.Scanner;
class Amstrong{
public static void main ( String[] args)
{
int num; int r ,sum = 0; int ams_num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a  number :   ");
num = sc.nextInt();
ams_num = num;
while(num>0)
{
r = num%10;
sum=sum+(r*r*r);
num = num/10;
}
if(sum==ams_num)
{
System.out.println(ams_num+ " is an Amstrong Number");
}
else
System.out.println(ams_num+ " is not an Amstrong Number");


}
}


