import java.util.*;
class book
{
  public String name;
  public String author;
  public float price;
  public int pages;
  book()
   {

   }
  public void set_data()
   {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter name of the book: ");
     name=s.next();
     System.out.println("Enter author of the book: ");
     author=s.next();
     System.out.println("Enter price of the book: ");
     price=s.nextFloat();
     System.out.println("Enter number of pages in the book: ");
     pages=s.nextInt();
   }
  public void get_data()
   {
     System.out.println("\nName: "+name+"\nAuthor: "+author+"\nPrice: "+price+"\nPages: "+pages+"\n");
   }
  public String toString()
   {
     return("\nName: "+name+"\nAuthor: "+author+"\nPrice: "+price+"\nPages: "+pages+"\n");
   }
}


class bookprogram
{
  public static void main(String args[])
   {
     int i=0;
     int ch;
     Scanner a=new Scanner(System.in);
     System.out.print("Enter number of objects: ");
     int n=a.nextInt();
     book b[]=new book[10];
     while(i<n)
       { 
         b[i]=new book(); 
         System.out.println("Book "+(i+1));
         System.out.println("\n1)Using set and get data\n2)Using toString method\n3)Exit\n");
         System.out.print("Enter your choice: ");
         ch=a.nextInt();
         switch(ch)
           {
             case 1:b[i].set_data();
                    b[i].get_data();
                    break;
             case 2:b[i].set_data();
                    System.out.println(b[i]);
                    break;
             case 3:System.exit(0);
                    break;
           }
         i++;
        }
     }
}