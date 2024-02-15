import java.util.*;

public class Activity6_Minutes
{
   public static void main(String[]args)
   {
   Scanner scan = new Scanner(System.in);
   
   int week, minsaWeek;
   
   System.out.printf("Enter Number of Weeks: ");
   week = scan.nextInt();
   
   minsaWeek = (60*24*7)*week;
   
   System.out.printf("Mins a Week:  %d minutes\n", minsaWeek );
   
   
   
   }
}