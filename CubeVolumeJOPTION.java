public class CubeVolumeJOPTION
{
   private double sideLength;
   
   public CubeVolumeJOPTION(double sideLength)
   {
      this.sideLength = sideLength; 
   }
   
   public double getsideLength()
   {
      return this.sideLength;
   }

   public double calc()
   {
      return getsideLength() * getsideLength() * getsideLength();
   }
}