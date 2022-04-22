import java.lang.String;
import java.util.Scanner;
public class Switchcase{
public static void main (String [] args){
int num1,num2;
Scanner sc = new Scanner(System.in);
System.out.println("enter two numbers: ");
num1= sc.nextInt();
num2 = sc.nextInt();
char operator ;
System.out.println("select a operator ; + - / * % ");
operator = sc.next().charAt(0);
switch(operator)
{
case '+' : 
               System.out.println(+(num1+num2));
               break;
case '-' : 
               System.out.println(+(num1-num2));
               break;
case '*' : 
               System.out.println(+(num1*num2));
               break;
case '/' : 
               System.out.println(+(num1/num2));
               break;
case '%' : 
               System.out.println(+(num1%num2));
               break;
default : 
             System.out.println("Invalid operator");
}
}
}