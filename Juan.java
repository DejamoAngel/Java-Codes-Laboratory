public class Juan
{
   private int ageCoder, ageInstructor, ageTamad;
   
   public Juan(int ageCoder, int ageInstructor, int ageTamad)
   {
      this.ageCoder = ageCoder;
      this.ageInstructor = ageInstructor;
      this.ageTamad = ageTamad;
   }
   
   public int getageCoder()
   {
      return this.ageCoder;
   }
   
   public int getageInstructor()
   {
      return this.ageInstructor;
   }

   public int getageTamad()
   {
      return this.ageTamad;
   }
   
   public int calc()
   {
      return (getageCoder() * getageInstructor() / getageTamad()) + 1;
   }

}