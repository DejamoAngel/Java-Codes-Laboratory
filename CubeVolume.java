public class CubeVolume
{
   private double side;
   
   public CubeVolume(double side)
   {
      this.side = side; 
   }
   
   public double getside()
   {
      return this.side;
   }

   public double calc()
   {
      return getside() * getside() * getside();
   }
}