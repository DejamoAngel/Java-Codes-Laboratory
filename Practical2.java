import javax.swing.*;

public class Practical2
{
   public static void main(String[]args)
   {
   String score1, score2, score3;
   
   score1 = JOptionPane.showInputDialog("Enter score1: ");
   double one = Double.parseDouble(score1);
  
   score2 = JOptionPane.showInputDialog("Enter score2: ");
   double two = Double.parseDouble(score2);
   
   score3 = JOptionPane.showInputDialog("Enter score3: ");
   double three = Double.parseDouble(score3);
   
   double sum = one+two+three;
   double average = sum/3;
   
   JOptionPane.showMessageDialog(null, String.format("The sum is: %.2f", sum));
   JOptionPane.showMessageDialog(null, String.format("The average is: %.2f", average));
   
   }

}