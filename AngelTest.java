import javax.swing.*;

public class AngelTest
{
   public static void main(String[]args)
   {
   String agec, agei, aget;
   
   agec = JOptionPane.showInputDialog("Enter age of The Coder: ");
   int one = Integer.parseInt(agec);
  
   agei = JOptionPane.showInputDialog("Enter age of his Instructor: ");
   int two = Integer.parseInt(agei);
   
   aget = JOptionPane.showInputDialog("Enter age of his friend, Tamad: ");
   int three = Integer.parseInt(aget);
   
   AngelTest2 a = new AngelTest2(one, two, three);
   JOptionPane.showMessageDialog(null, String.format("Child is " + a.calc() + " years old."));
   
   
   }

}