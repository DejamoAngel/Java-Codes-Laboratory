import javax.swing.*;

public class Practical2test3
{
   public static void main(String[]args)
   {
   String length, width;
   
   length = JOptionPane.showInputDialog("Length: ");
   int one = Integer.parseInt(length);
   
   width = JOptionPane.showInputDialog("Width: ");
   int two = Integer.parseInt(width);

   int area = one*two;
   
   JOptionPane.showMessageDialog(null, String.format("Area: %d", area));
   
   }
}