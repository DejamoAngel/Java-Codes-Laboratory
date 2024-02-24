import javax.swing.*;

public class PrelimGetLastNumberJOPTION
{
   public static void main(String[]args)
   {
      
      String result;
      
      result = JOptionPane.showInputDialog("Enter a Three Digit Number: ");
      int one = Integer.parseInt(result);
      
      PrelimLastNumber f = new PrelimLastNumber(one);
      JOptionPane.showMessageDialog(null, String.format("Last Number is: %d", f.calc())); 
         
   }
   
}