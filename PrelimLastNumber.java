public class PrelimLastNumber
{
   private int result;
   
   public PrelimLastNumber(int result)
   {
      this.result = result;
   }

   public int getresult()
   {
      return this.result;
   }
   
   public int calc()
   {
      return getresult() % 10;
   }
   /*
   
   This program prompts the user to enter a three-digit number, reads the input 
   using a Scanner, extracts the last digit by performing the modulo operation 
   with 10, and prints the last digit.

   The modulo operation % returns the remainder of the division of the two operands. 
   In this case, the number is being divided by 10, and the remainder is being kept.

   For example, if num is 321, then the result of num % 10 is 1. This is because 321 
   divided by 10 is 32 with a remainder of 1.

   The result of num % 10 is then being assigned to the variable lastDigit of type int.
   */
}