import java.util.*;
import SEE.*;
import CIE.*;

public class pkg{
	public static void main(String args[]){
		externals obj1=new externals();
		internals obj2=new internals();
		System.out.println("\n**DETAILS**");
		System.out.println("\nName: "+obj1.name+"\nUSN: "+obj1.usn+"\nSem: "+obj1.sem);
		System.out.println("Final marks: ");
		for(int i=0;i<5;i++){
			System.out.println("Subject "+(i+1)+": ");
			System.out.println((obj1.mark[i]+obj2.marks[i]));
		}
	}
}
