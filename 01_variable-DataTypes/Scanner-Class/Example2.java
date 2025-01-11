/* Example-1 - Hotel booking system
creating a hotel booking system where the user provides details
like name, age, number of nights, and whether they need additional services.
*/
import java.util.Scanner;
public class HotelBookingSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Collect user details 
        System.out.println("Hotel Booking System");
        System.out.println("Enter Your Full Name :");
        String name = sc.nextLine();

        System.out.println("Enter Your Age :");
        int age = sc.nextInt();
        
        System.out.println("Enter the number of nights you want to stay:");
        int nights = sc.nextInt();
         // Consume leftover newline
        sc.nextLine();

        System.out.println("Do you need additional services? (yes/no):");
        String additionalServices = sc.nextLine();

        // calculate cost 
        int costpernight = 100;
        int totalCost = costpernight * nights;

        // Display Booking Summary
        System.out.println("Booking Summary:");
        System.out.println("Welcome , "+name +" in our Aalishan Taj Hotel");

        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Number of Nights :"+nights);
        System.out.println("Additional Services :"+additionalServices);
        System.out.println("Total Cost :"+totalCost);

        System.out.println("Thank u for Choosing our hotel , enjoy your day!");
        sc.close();
    }
}