class AlphabetPattern
{
public static void main (String [] args)
{
int i,j,row = 5 ;
int alphabet = 65; 
for ( i = 0; i<= row; i++)
{
for(j=0; j<=i; j++)
{
System.out.print((char) (alphabet++)+"   ");
}
System.out.println();
}
}
}