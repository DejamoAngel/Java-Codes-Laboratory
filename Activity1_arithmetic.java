import java.util.*;

public class Activity1_arithmetic
{
   public static void main(String[] args)
   {
      double a, b, c, d, x, y;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.printf("Enter a value of x: ");
      x = scan.nextDouble();
      
      System.out.printf("Enter a value of y: ");
      y = scan.nextDouble();
      
      a = x+y;
      b = x-y;
      c = x*y;
      d = x/y;
      
      System.out.printf("\n%.1f + %.1f = %.1f", x, y, a);
      System.out.printf("\n%.1f - %.1f = %.1f", x, y, b);
      System.out.printf("\n%.1f * %.1f = %.1f", x, y, c);
      System.out.printf("\n%.1f / %.1f = %.1f", x, y, d);

      
   
   }
}