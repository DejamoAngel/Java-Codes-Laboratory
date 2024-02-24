public class AreaofaTriangle
{
   private double base, height;
   
   public AreaofaTriangle(double base, double height)
   {
      this.base = base;
      this.height = height;   
   }
   
   public double getbase()
   {
      return this.base;
   }
   
   public double getheight()
   {
      return this.height;
   }

   public double calc()
   {
      return ((getbase() * getheight()) / 2);
   }

}