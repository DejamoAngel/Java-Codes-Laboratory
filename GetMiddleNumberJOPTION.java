import javax.swing.*;
public class GetMiddleNumberJOPTION
{
   public static void main(String[] args)
   {
      String num1, num2, num3;
      num1 = JOptionPane.showInputDialog("First Number: ");
      int one = Integer.parseInt(num1);
      
      num2 = JOptionPane.showInputDialog("Second Number: ");
      int two = Integer.parseInt(num2);
      
      num3 = JOptionPane.showInputDialog("Third Number: ");
      int three = Integer.parseInt(num3);
      
      MiddleNumberJOPTION m = new MiddleNumberJOPTION(one, two, three);
      JOptionPane.showMessageDialog(null, String.format("Middle Number is : " + m.calc()));
   }
}