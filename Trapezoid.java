import java.util.*;
public class Trapezoid
{
   public static void main(String[]args)
   {
      
      Scanner s = new Scanner(System.in);
      double b1, b2, h;
      System.out.print("Base 1: ");
      b1  = s.nextDouble();
      
      System.out.print("Base 2: ");
      b2  = s.nextDouble(); 
      
      System.out.print("Height: ");
      h  = s.nextDouble();
      
      AreaofaTrapezoid a = new AreaofaTrapezoid(b1, b2, h);
      System.out.printf("Area of the trapezoid is: %.2f", a.calc());
   }
}