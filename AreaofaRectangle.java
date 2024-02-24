public class AreaofaRectangle
{
   private double l, w;
   
   public AreaofaRectangle(double l, double w)
   {
      this.l = l;
      this.w = w;   
   }
   
   public double getl()
   {
      return this.l;
   }
   
   public double getw()
   {
      return this.w;
   }

   public double calc()
   {
      return getl() * getw();
   }

}