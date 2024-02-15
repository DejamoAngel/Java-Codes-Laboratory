import java.util.*;

public class Activity8_Mimi 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int km, hours;
        
        System.out.print("Enter kilometers to run: ");
        km = input.nextInt();

        hours = km/2;
        System.out.printf("If you run %d kilometers it will take %d hour/s.", km, hours);
    }
}
