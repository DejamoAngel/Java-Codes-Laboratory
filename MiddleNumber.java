public class MiddleNumber
{
   private int num1, num2, num3;
   
   public MiddleNumber(int num1, int num2, int num3)
   {
      this.num1 = num1;
      this.num2 = num2;
      this.num3 = num3;
   }
   
   public int getnum1()
   {
      return this.num1;
   }
   
   public int getnum2()
   {
      return this.num2;
   }

   public int getnum3()
   {
      return this.num3;
   }
   
   public int calc()
   {
      return Math.max(Math.min(getnum1(), getnum2()), Math.min(getnum2(), getnum3()));
   }
}