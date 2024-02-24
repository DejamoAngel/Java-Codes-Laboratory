import java.util.*;
public class PrelimGetFamilyMembers
{
   public static void main(String[]args)
   {
      Scanner s = new Scanner(System.in);
      
      int one, two;
      
      System.out.print("Enter People: ");
      one = s.nextInt();
      
      System.out.print("Enter Family : ");
      two = s.nextInt();
      
      PrelimFamilyMembers p = new PrelimFamilyMembers(one, two);
      System.out.printf("Members Per Family: %d", p.calc());
   
   }
}