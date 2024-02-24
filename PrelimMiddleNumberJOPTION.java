public class PrelimMiddleNumberJOPTION
{
   private int result;
   
   public PrelimMiddleNumberJOPTION(int result)
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
   
   In the statement int firstDigit = num / 100;, the argument num / 100 is performing integer division.
   division is a type of arithmetic operation that in an integer quotient. In this case, value of num 
   is being divided by 100, and the result is being truncated to the nearest integer. For example, if 
   num is 321, then the result of num / 100 is 3. This is because 321 divided by 100 is 3.21, but since 
   we are performing integer division, the decimal part is discarded and only the integer part is returned.
   The result of num / 100 is then being assigned to the variable firstDigit of type int.

   This is a common technique to extract the first digit of a three-digit number. By dividing the number 
   by 100, we are effectively removing the last two digits and keeping only the first digit.
   
   */
}