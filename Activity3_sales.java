import java.util.*;

public class Activity3_sales 
{
   public static void main(String[]args)
   {
      
      double priceOfItem, tax, salesTax, finalPrice ;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.printf("Price of Item :Php");
      priceOfItem = scan.nextDouble();

      tax = .12;
      salesTax = priceOfItem * tax;
      finalPrice = priceOfItem + salesTax; 
      
      
      System.out.printf("\nSales Tax   :Php %.2f", salesTax);
      System.out.printf("\nFinal Price :Php%.2f", finalPrice);

      
   }
}
