import java.util.*;
public class Rectangle
{
   public static void main(String[]args)
   {
      
      Scanner s = new Scanner(System.in);
      double base, height;
      System.out.print("Base: ");
      base  = s.nextInt();
      
      System.out.print("Height: ");
      height  = s.nextInt(); 
      
      AreaofaRectangle a = new AreaofaRectangle(base, height);
      System.out.printf("Area of the rectangle is: %.2f", a.calc());
   }
}