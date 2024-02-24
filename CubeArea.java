public class CubeArea
{
   private double sideLength;
   
   public CubeArea(double sideLength)
   {
      this.sideLength = sideLength; 
   }
   
   public double getsideLength()
   {
      return this.sideLength;
   }

   public double calc()
   {
      return getsideLength() * getsideLength() * 6;
   }
}