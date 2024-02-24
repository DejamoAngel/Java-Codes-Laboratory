public class PrelimMiddleNumber
{
   private int result;
   
   public PrelimMiddleNumber(int result)
   {
      this.result = result;
   }

   public int getresult()
   {
      return this.result;
   }
   
   public int calc()
   {
      return (getresult() / 10) % 10;
   }
   /*
   
   This program prompts the user to enter a three-digit number, reads the input using a Scanner, 
   extracts the middle digit by performing two arithmetic operations:

   Divide the number by 10: num / 10 to remove the last digit and get the two-digit number.
   Perform the modulo operation with 10: % 10 to extract the last digit of the two-digit number.
   The result of num / 10 % 10 is then being assigned to the variable middleDigit of type int.
   
   For example, if num is 321, then the result of num / 10 % 10 is 2. This is because 321 divided 
   by 10 is 32, and 32 modulo 10 is 2.
  
   */
}