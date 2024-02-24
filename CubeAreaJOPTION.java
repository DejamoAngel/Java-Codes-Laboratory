public class CubeAreaJOPTION
{
   private double sideLength;
   
   public CubeAreaJOPTION(double sideLength)
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