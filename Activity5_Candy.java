import java.util.*;

public class Activity5_Candy
{
   public static void main(String[]args)
   {
   Scanner scan = new Scanner(System.in);
   
   int sBox, cBars, bBox;
   
   System.out.printf("Small Boxes: ");
   sBox = scan.nextInt();
   
   System.out.printf("Candy Bars inside each small boxes: ");
   cBars = scan.nextInt();
   
   System.out.printf("Total amount of Candy Bars inside the Big Box:  %d", (sBox*cBars));
   
   
   
   }
}