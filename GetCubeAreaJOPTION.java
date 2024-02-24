import javax.swing.*;
public class GetCubeAreaJOPTION
{
   public static void main(String[] args)
   {
      String sideLength;
      sideLength = JOptionPane.showInputDialog("Enter the side length of the cube: ");
      double one = Double.parseDouble(sideLength);
      
      CubeAreaJOPTION c = new CubeAreaJOPTION(one);
      JOptionPane.showMessageDialog(null, String.format("Area of cube is : %.2f" , c.calc()));
   }
}