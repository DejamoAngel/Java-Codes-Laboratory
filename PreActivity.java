//utilities
import java.util.*; // "*" means all

public class PreActivity
{
   public static void main(String[]args)
   {
      //declaration
      String name;
      int hoursWorked, deduction;
      double ratePerHour, grossPay, netPay;
      
      Scanner input = new Scanner(System.in); //to read the values of input
      
      //Prompt Statement
      System.out.println("Expected Output: ");
      
      System.out.print("Enter Name: ");
      name = input.nextLine();
      
      System.out.print("Enter Rate Per Hour: ");
      ratePerHour = input.nextDouble();
      
      System.out.print("Enter Hoursworked: ");
      hoursWorked = input.nextInt();
      
      System.out.print("Enter Deduction: ");
      deduction = input.nextInt();
      
      
      //Process
      grossPay = ratePerHour * hoursWorked;
      netPay = grossPay - deduction;
      
      
      //Output
      System.out.printf("\nGrosspay is Php%.2f", grossPay);
      System.out.printf("\nNet Pay is Php%.2f", netPay);

      
   }
}