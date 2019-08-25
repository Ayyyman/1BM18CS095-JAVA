import java.util.*;

class Student{
  public String usn;
  public String name;
  public int credits[] = new int[5];
  public int marks[] = new int[5];
  public float sgpa;
  public int totCredits;
  public int i;

  public void inputData(){
    Scanner S = new Scanner(System.in);

    System.out.print("Enter your Name:");
    name = S.nextLine();
    System.out.print("Enter your USN:");
    usn = S.nextLine();
    System.out.println("\nEnter your Marks:");
    for(i=0; i<5; i++){
      System.out.print("\tSubject "+(i+1)+": ");
      marks[i]=S.nextInt();
    }
    System.out.println("\nEnter the Credits for each Subject :");
    for(i=0; i<5; i++){
      System.out.print("\tSubject "+(i+1)+": ");
      credits[i]=S.nextInt();
      totCredits += credits[i];
    }
  }

  public void calcSGPA(){
    for(i=0; i<5; i++){
      if(marks[i] >= 90)
        sgpa += credits[i]*10;
      else if(marks[i] >= 75)
        sgpa += credits[i]*9;
      else if(marks[i] >= 60)
       sgpa += credits[i]*8;
      else if(marks[i] >= 50)
        sgpa += credits[i]*7;
      else if(marks[i] >= 45)
        sgpa += credits[i]*5;
      else if(marks[i] >= 40)
        sgpa += credits[i]*4;
      else
        break;
    }
    sgpa /= totCredits;
  }

  public void display(){
    System.out.println("\n-------DETAILS-------");
    System.out.println("Name: "+name+"\nUSN: "+usn);
    System.out.println("Marks:");
    for(i=1; i<=5; i++){
      System.out.println("\tSubject "+i+": "+marks[i]);
    }
    System.out.println("SGPA = "+sgpa);
    System.out.println("---------------------");
  }

  public static void main(String args[]){
    Student obj = new Student();
    obj.inputData();
    obj.calcSGPA();
    obj.display();
  }
}
