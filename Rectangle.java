import java.util.*;
public class Rectangle
{
   public static void main(String[]args)
   {
      
      Scanner s = new Scanner(System.in);
      double l, w;
      System.out.print("Length: ");
      l  = s.nextDouble();
      
      System.out.print("Width: ");
      w  = s.nextDouble(); 
      
      AreaofaRectangle a = new AreaofaRectangle(l, w);
      System.out.printf("Area of the rectangle is: %.2f", a.calc());
   }
}