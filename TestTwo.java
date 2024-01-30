//utilities
import java.util.*; // "*" means all

public class TestTwo
{
   public static void main(String[]args)
   {
      //declaration
      int result, age;
      String name;
      double salary;
      char letter = 'A';
      
      Scanner input = new Scanner(System.in); //to read the values of input
      
      //Prompt Statement
      System.out.print("Enter your name: ");
      name = input.nextLine();
      
      System.out.print("Enter your age: ");
      age = input.nextInt();
      
      System.out.print("Enter your salary: ");
      salary = input.nextDouble();
      
      //Process
      salary = 200.50 * 8;
      
      
      //Output
      System.out.printf("The Salary is: %.2f", salary);
      
   }
}