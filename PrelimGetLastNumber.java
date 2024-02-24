import java.util.*;

public class PrelimGetLastNumber
{
   public static void main(String[]args)
   {
      Scanner s = new Scanner(System.in);
      
      int result;
      System.out.print("Enter a Three Digit Number: ");
      result = s.nextInt();
      
      PrelimLastNumber f = new PrelimLastNumber(result);
      System.out.printf("Last Number is: %d", f.calc()); 
         
   }
   
}