import java.util.*;
class fibonacci
{
public static void main(String args[])
{
int n,i;
int a=0;
int b=1;
Scanner s = new Scanner(System.in);
System.out.println("Enter the numbers of terms to be printed");
n=s.nextInt();
if(n==1)
{
System.out.println(a);
}
else if(n==2)
{
System.out.println(a+ "," + b ",");
}
else
{
System.out.print(a + b +",");

for(i=2; i<=n; i++)
{
int j= a+b;
System.out.print(j +",");
a=b;
b=j;
}
}}
}