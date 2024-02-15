import java.util.*;

public class Activity2_salary 
{
   public static void main(String[]args)
   {
      
      String name;
      double salary, overtime, grossPay, deductions, netPay;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.printf("Name          : ");
      name = scan.nextLine();
      
      System.out.printf("Salary        :Php");
      salary = scan.nextDouble();
      
      System.out.printf("Overtime      :Php");
      overtime = scan.nextDouble();

      System.out.printf("Deductions    :Php");
      deductions = scan.nextDouble();

      
     grossPay = salary + overtime;
     netPay = grossPay - deductions; 
      
      
      System.out.printf("\nGross Pay    :Php%.2f", grossPay);
      System.out.printf("\nNet Pay      :Php%.2f", netPay);

      
   }
}
