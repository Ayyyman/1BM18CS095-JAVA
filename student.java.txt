import java.util.*;

class Student{
  public String usn;
  public String name;
  public int credits[] = new int[5];
  public int marks[] = new int[5];
  public float SGPA;
  public int totCredits;
  public int i;

  public void inputData(){
    Scanner S = new Scanner(System.in);

    System.out.println("Enter the following:");
    System.out.print("USN:");
    usn = S.nextLine();
    System.out.print("Name:");
    name = S.nextLine();
    System.out.println("\nEnter Marks for:");
    for(i=0; i<5; i++){
      System.out.print("\tSubject"+(i+1)+": ");
      marks[i]=S.nextInt();
    }
    System.out.println("\nEnter Credits for:");
    for(i=0; i<5; i++){
      System.out.print("\tSubject"+(i+1)+": ");
      credits[i]=S.nextInt();
      totCredits += credits[i];
    }
  }

  public void calcSGPA(){
    for(i=0; i<5; i++){
      if(marks[i] >= 90)
        SGPA += credits[i]*10;
      else if(marks[i] >= 75)
        SGPA += credits[i]*9;
      else if(marks[i] >= 60)
        SGPA += credits[i]*8;
      else if(marks[i] >= 50)
        SGPA += credits[i]*7;
      else if(marks[i] >= 45)
        SGPA += credits[i]*5;
      else if(marks[i] >= 40)
        SGPA += credits[i]*4;
      else
        break;
    }
    SGPA /= totCredits;
  }

  public void display(){
    System.out.println("\n-------DETAILS-------");
    System.out.println("Name: "+name+"\nUSN: "+usn);
    System.out.println("Marks:");
    for(i=0; i<5; i++){
      System.out.println("\tSubject"+i+": "+marks[i]);
    }
    System.out.println("SGPA = "+SGPA);
    System.out.println("---------------------");
  }

  public static void main(String args[]){
    Student obj = new Student();
    obj.inputData();
    obj.calcSGPA();
    obj.display();
  }
}