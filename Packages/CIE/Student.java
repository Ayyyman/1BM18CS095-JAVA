package CIE;
import java.util.*;

public class student{
	public String name;
	public String usn;
	public int sem;
	Scanner s=new Scanner(System.in);
	public student(){
		System.out.print("Enter name: ");
		name=s.next();
		System.out.print("Enter usn: ");
		usn=s.next();
		System.out.print("Enter sem: ");
		sem=s.nextInt();
	}
}
