package SEE;

import java.util.*;
import CIE.student;

public class externals extends student{
	public int mark[]=new int[5];
	Scanner x=new Scanner(System.in);
	public externals(){
		System.out.println("Enter five subject external marks: ");
		for(int j=0;j<5;j++)
			mark[j]=x.nextInt();
	}
}
