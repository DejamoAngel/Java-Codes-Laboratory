import java.util.*;

public class Activity9_Millimeter
{
   public static void main(String[]args)
   {
   Scanner scan = new Scanner(System.in);
   
   double mm, inches, equivalent;
   
   System.out.printf("Enter Millimeter: ");
   mm = scan.nextDouble();
   
   inches = 1.0 / 25.4; //conversion of inches to mm
   equivalent = mm*inches;
   System.out.printf("Equivalent Inches:  %.2f inches", equivalent);
   
   
   
   }
}