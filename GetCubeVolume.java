import java.util.*;
public class GetCubeVolume
{
   public static void main(String[]args)
   {
      Scanner s = new Scanner(System.in);
      
      double side;
      
      System.out.print("Enter the side of the cube: ");
      side = s.nextDouble();
      
      CubeVolume c = new CubeVolume(side);
      System.out.printf("The Volume of the cube is: %.2f", c.calc());
   }
}