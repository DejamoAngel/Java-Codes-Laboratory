import java.util.*;
public class Child
{
   public static void main(String[]args)
   {
      int agec, agei, aget;
      
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter age of The Coder: ");
      agec = s.nextInt();
      System.out.print("Enter age of his Instructor: ");
      agei = s.nextInt();
      System.out.print("Enter age of his friend, Tamad: ");
      aget = s.nextInt();
      
      
      Age a = new Age(agec, agei, aget);
      System.out.print("Child age is: " + a.calc());
   }
}