//Diameter of a Circle and get the Area of Circle and Square
import java.util.*;

public class AreaofCircleandSquare
{
   public static void main(String[]args)
   {
      double PI, radius;
      
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter Radius: ");
      radius = s.nextDouble();
      
      System.out.print("Enter PI: ");
      PI = s.nextDouble();
      
      System.out.printf("Area of Circle: %.2f", (radius*radius*PI));
      System.out.printf("\nArea of Square: %.2f", (radius*radius));

      
   }
}
