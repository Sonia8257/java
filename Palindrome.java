import java.util.Scanner;
public class Palindrome {
 public static void main(String args[]){  
  int r,sum=0;
int orgnum;    
 Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
  orgnum=n;    
  while(n>0){    
   r=n%10; 
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(orgnum==sum)    
   System.out.println("it is a palindrome number ");    
  else    
   System.out.println("not a palindrome number ");    
}  
}  