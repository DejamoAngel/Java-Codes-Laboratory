import javax.swing.*;

public class Practical2test2
{
   public static void main(String[]args)
   {
   String candies, son;
   
   candies = JOptionPane.showInputDialog("Mom candies: ");
   int one = Integer.parseInt(candies);
   
   son = JOptionPane.showInputDialog("Son candies: ");
   int two = Integer.parseInt(son);

   int left = one-two;
   
   JOptionPane.showMessageDialog(null, String.format("Candies left: %d", left));
   
   }
}