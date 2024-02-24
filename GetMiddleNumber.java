import java.util.*;

public class GetMiddleNumber
{
   public static void main(String[]args)
   {
      Scanner s = new Scanner(System.in);
      
      int num1, num2, num3;
      System.out.print("Enter First Number: ");
      num1 = s.nextInt();
      
      System.out.print("Enter Second Number: ");
      num2 = s.nextInt();
      
      System.out.print("Enter Third Number: ");
      num3 = s.nextInt();
      
      MiddleNumber m = new MiddleNumber(num1, num2, num3);
      System.out.printf("Middle Number is: %d", m.calc()); 
         
   }
   
}