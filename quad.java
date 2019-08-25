import java.util.*;
import java.lang.Math.*;
class quad
{
public static void main (String args[])
{
Scanner s = new Scanner(System.in);
int a,b,c;
double r1,r2, im1, im2;
System.out.println(" Enter the coefficients");
a= s.nextInt();
b =s.nextInt();
c=s.nextInt();
int d= (b*b - (4*a*c));
System.out.println(" Disriminant=" +d);
if(d>0)
{
System.out.println(" Roots are real and distinct\n");
r1= (-b + Math.sqrt (d))/ (2*a);
r2=(-b - Math.sqrt (d))/ (2*a);
System.out.println(" The roots are:" +r1+ "and" +r2);

}
else if(d==0)
{
System.out.println(" Roots are real and equal\n");
r1=r2= -b/ (2*a);
System.out.println(" The roots are:" +r1+ "and"+r2);

}
else 
{
System.out.println(" Roots are imaginary\n");
r1=r2= -b/(2*a);
im1=im2= (Math.sqrt (-d))/(2*a);
System.out.println("The roots are:" +r1+ "+"+ im1+"i and" +r1+ "+" +im2 +"i");

}
}}
