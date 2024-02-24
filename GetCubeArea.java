import java.util.*;
public class GetCubeArea
{
   public static void main(String[]args)
   {
      Scanner s = new Scanner(System.in);
      
      double sideLength;
      
      System.out.print("Enter the side length of the cube: ");
      sideLength = s.nextDouble();
      
      CubeArea c = new CubeArea(sideLength);
      System.out.printf("The Area of the cube is: %.2f", c.calc());
   }
}