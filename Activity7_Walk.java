import java.util.*;

public class Activity7_Walk
{
   public static void main(String[]args)
   {
   Scanner scan = new Scanner(System.in);
   
   double total, hour,min,prep,finalHour,finalTotal;
   int wrk,walk;
   
   System.out.printf("Enter hours: ");
   hour = scan.nextInt();
   
   System.out.printf("Enter minutes: ");
   min = scan.nextInt();
   
   System.out.printf("\nTotal time he take while walking to the NSA quadrangle: ");
   walk = scan.nextInt();
   System.out.printf("\nTotal time he take while prparing: ");
   wrk = scan.nextInt();

   total = (hour*60)+min;
   prep = total - (walk+wrk);
   finalHour = prep /60;
   finalTotal = (finalHour % 1)*59;
   System.out.printf("Juan must leaves at %.0f:%.0f AM", finalHour, finalTotal);
   
   
   
   }
}