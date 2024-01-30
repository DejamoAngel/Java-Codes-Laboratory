//utilities
import java.util.*; // "*" means all

public class Activity1
{
   public static void main(String[]args)
   {
      //declaration
      int score1, score3;
      double score2, sum, average;
      
      Scanner input = new Scanner(System.in); //to read the values of input
      
      //Prompt Statement
      System.out.println("Expected Output: ");
      
      System.out.print("Enter score1: ");
      score1 = input.nextInt();
      
      System.out.print("Enter score2: ");
      score2 = input.nextDouble();
      
      System.out.print("Enter score3: ");
      score3 = input.nextInt();
      
      
      //Process
      sum = score1 + score2 + score3;
      average = sum/3;
      
      
      //Output
      System.out.printf("The average is: " + average);
      
   }
}