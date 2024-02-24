import java.util.*;
public class Triangle
{
   public static void main(String[]args)
   {
      
      Scanner s = new Scanner(System.in);
      double base, height;
      System.out.print("Base: ");
      base  = s.nextInt();
      
      System.out.print("Height: ");
      height  = s.nextInt(); 
      
      AreaofaTriangle a = new AreaofaTriangle(base, height);
      System.out.printf("Area of the triangle is: %.2f", a.calc());
   }
}