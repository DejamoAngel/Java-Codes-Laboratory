import javax.swing.*;

public class PrelimGetMiddleNumberJOPTION
{
   public static void main(String[]args)
   {
      
      String result;
      
      result = JOptionPane.showInputDialog("Enter a Three Digit Number: ");
      int one = Integer.parseInt(result);
      
      PrelimMiddleNumber f = new PrelimMiddleNumber(one);
      JOptionPane.showMessageDialog(null, String.format("Middle Number is: %d", f.calc())); 
         
   }
   
}