public class Age
{
   private int agec, agei, aget;
   
   public Age(int agec, int agei, int aget)
   {
      this.agec = agec;
      this.agei = agei;
      this.aget = aget;
   }
   
   public int getagec()
   {
      return this.agec;
   }
   
   public int getagei()
   {
      return this.agei;
   }

   public int getaget()
   {
      return this.aget;
   }
   
   public int calc()
   {
      return (getagec() * getagei() / getaget()) + 1;
   }

}