import java.util.*;

public class JuanChild
{
   public static void main(String[]args)
   {
   Scanner s = new Scanner(System.in);
   
   System.out.print("Enter age of The Coder: ");
   int ageCoder = s.nextInt();
   
   System.out.print("Enter age of his Instructor: ");
   int ageInstructor = s.nextInt();

   System.out.print("Enter age of his friend, Tamad: ");
   int ageTamad = s.nextInt();
   
   Juan j = new Juan(ageCoder, ageInstructor, ageTamad);
   System.out.print("Child ages = " + j.calc());

   
   
   }
}