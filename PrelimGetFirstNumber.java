import java.util.*;

public class PrelimGetFirstNumber
{
   public static void main(String[]args)
   {
      Scanner s = new Scanner(System.in);
      
      int result;
      System.out.print("Enter a Three Digit Number: ");
      result = s.nextInt();
      
      
      PrelimFirstNumber f = new PrelimFirstNumber(result);
      System.out.printf("First Number is: %d", f.calc()); 
         
   }
   
}