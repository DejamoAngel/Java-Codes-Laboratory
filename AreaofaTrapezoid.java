public class AreaofaTrapezoid
{
   private double b1, b2, h;
   
   public AreaofaTrapezoid(double b1, double b2, double h)
   {
      this.b1 = b1;
      this.b2 = b2;   
      this.h = h;
   }
   
   public double getb1()
   {
      return this.b1;
   }
   
   public double getb2()
   {
      return this.b2;
   }
   
   public double geth()
   {
      return this.h;
   }


   public double calc()
   {
      return ((getb1() + getb2()) / 2) * geth();
   }

}