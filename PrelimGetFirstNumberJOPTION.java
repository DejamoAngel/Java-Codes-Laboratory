import javax.swing.*;

public class PrelimGetFirstNumberJOPTION
{
   public static void main(String[]args)
   {
      
      String result;
      
      result = JOptionPane.showInputDialog("Enter a Three Digit Number: ");
      int one = Integer.parseInt(result);
      
      PrelimFirstNumber f = new PrelimFirstNumber(one);
      JOptionPane.showMessageDialog(null, String.format("First Number is: %d", f.calc())); 
         
   }
   
}