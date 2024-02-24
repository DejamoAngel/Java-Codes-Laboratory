import java.util.*;

public class PrelimGetMiddleNumber
{
   public static void main(String[]args)
   {
      Scanner s = new Scanner(System.in);
      
      int result;
      System.out.print("Enter a Three Digit Number: ");
      result = s.nextInt();
      
      
      PrelimMiddleNumber f = new PrelimMiddleNumber(result);
      System.out.printf("Middle Number is: %d", f.calc()); 
         
   }
   
}