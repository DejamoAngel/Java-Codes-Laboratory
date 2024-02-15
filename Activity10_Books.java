import java.util.*;

public class Activity10_Books {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double books, mon, tues, wed, thurs, friday, notSold, percentage;

        System.out.printf("Enter Number of Books: ");
        books = scan.nextDouble();

        System.out.printf("Sold on Monday: ");
        mon = scan.nextDouble();

        System.out.printf("Sold on Tuesday: ");
        tues = scan.nextDouble();

        System.out.printf("Sold on Wednesday: ");
        wed = scan.nextDouble();

        System.out.printf("Sold on Thusday: ");
        thurs = scan.nextDouble();

        System.out.printf("Sold on Friday: ");
        friday = scan.nextDouble();

        notSold = books - mon - tues - wed - thurs - friday;
        percentage = (notSold/books)* 100;

         System.out.printf("Total of the books who were not Sold: %.2f%%", percentage);
   
    }
}