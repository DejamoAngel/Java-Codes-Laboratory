import javax.swing.*;
public class GetCubeVolumeJOPTION
{
   public static void main(String[] args)
   {
      String sideLength;
      sideLength = JOptionPane.showInputDialog("Enter the side length of the cube:: ");
      double one = Double.parseDouble(sideLength);
      
      CubeVolumeJOPTION c = new CubeVolumeJOPTION(one);
      JOptionPane.showMessageDialog(null, String.format("Volume of cube is : %.2f " , c.calc()));
   }
}