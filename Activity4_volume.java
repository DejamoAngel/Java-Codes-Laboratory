import java.util.*;

public class Activity4_volume 
{
   public static void main(String[]args)
   {
      
      double PI, radius, height, volume;
      
      Scanner scan = new Scanner(System.in);
      
      PI = 3.1416;

      System.out.printf("Radius                   :");
      radius = scan.nextDouble();
      
      System.out.printf("Height                   :");
      height = scan.nextDouble();

      
      volume = PI*radius*radius*height/3;
     
      
      System.out.printf("\nThe volume of a cone is  : %.2f", volume);
     

      
   }
}
