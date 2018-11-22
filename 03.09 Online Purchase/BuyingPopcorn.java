
/**
 * This class simulates an online purchase by asking the user for input and displaying a receipt.
 *
 * Ipshita Bhatnagar
 * 10/1/2018
 */
import java.util.Scanner;
public class BuyingPopcorn
{
    public static void main(String [ ] args)
    {
        Scanner in;
        in = new Scanner(System.in);
        
        System.out.println("Welcome");
        System.out.println("Please enter your first and last name: ");
        String fname = in.next();
        String lname = in.nextLine();
        System.out.println("Enter today's date (mm/dd/yyyy): ");
        String date = in.next();
        System.out.println("What concert would you like to go to?: ");
        String concert = in.next();
        concert += in.nextLine();
        System.out.println("Would you like front row tickets or back row? (F or B): ");
        String row = in.next();
        System.out.println("How many tickets?: ");
        int tickets = Integer.parseInt(in.next());
        System.out.println("What is the ticket price?: ");
        double price = Double.parseDouble(in.next());
        System.out.println("Enter your debit card number (#####-###-####): ");
        String debit = in.next();
        System.out.println("Enter your PIN (#####): ");
        String PIN = in.next();
        System.out.println("***********************************************");
        System.out.println("Your e-Receipt");
        System.out.println();
        System.out.println(date);
        System.out.println("Order Number: " + fname.substring(0,2) + debit.substring(10));
        System.out.println();
        System.out.println(fname.substring(0,1) + ". " + lname);
        System.out.println("Account: ####-###-" + debit.substring(10));
        System.out.println("Name of concert attending: " + concert);
        System.out.println("Number of tickets: $" + tickets);
        System.out.println("Ticket Price: " + price);
        System.out.println("$" + tickets*price + " will be debited to your account.");
         System.out.println();
        System.out.println("Thank you. Enjoy your concert!");
        System.out.println("***********************************************");
    }
}