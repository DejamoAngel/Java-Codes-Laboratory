import java.util.*;

public class CalculateInterest
{
   public static void main(String[]args)
   {
   Scanner s = new Scanner(System.in);
  
   System.out.print("Enter Balance: ");
   double bal = s.nextDouble();
   
   System.out.print("Enter Rate: ");
   int rate = s.nextInt();
   
   double interest;
   interest = bal*rate/100;
   
   System.out.printf("\nSimple interest on $ %.2f at %d %% rate is $ %.2f", bal, rate, interest);

   }
}