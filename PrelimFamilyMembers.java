public class PrelimFamilyMembers
{
   private int one, two;
   
   public PrelimFamilyMembers(int one, int two)
   {
      this.one = one;
      this.two = two;
   }
   
   public int getone()
   {
      return this.one;
   }
   
   public int gettwo()
   {
      return this.two;
   }

   public int calc()
   {
      return getone() / gettwo();
   }

}