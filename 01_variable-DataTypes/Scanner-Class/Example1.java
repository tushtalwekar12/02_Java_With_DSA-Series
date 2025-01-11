// taking input from user - Create Scanner class object - input Function
import java.util.Scanner;
public class Example1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  // create an object of Scanner class
        
        // input function 1. next()
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Your name is :"+name);

        //2. nextLine()
        sc.nextLine();   // Consumes the leftover \n
        System.out.println("Enter your address:");
        String address = sc.nextLine();
        System.out.println("Your address is :"+address);

        // 3. nextBoolean()
        System.out.println("Are you married? (true/false):");
        boolean isMarried = sc.nextBoolean();
        System.out.println("You are married :"+isMarried);
  
        // 4. nextbyte() - read the byte value
        System.out.println("Enter your age:");
        byte age = sc.nextByte();
        System.out.println("Your age is :"+age);

        // 5. nextfloat()
        System.out.println("Enter your salary:");
        float salary = sc.nextFloat();
        System.out.println("Your salary is :"+salary);

        // 6. nextDouble()
        System.out.println("Enter your height:");
        double height = sc.nextDouble();
        System.out.println("Your height is :"+height);

        // 7. nextLong()
        System.out.println("Enter your roll number:");
        long roll = sc.nextLong();
        System.out.println("Your roll number is :"+roll);

        // 8. nextInt()
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();
        System.out.println("Your marks are :"+marks);

        // 9. nextShort()
        System.out.println("Enter your age:");
        short age1 = sc.nextShort();
        System.out.println("Your age is :"+age1);
    }
}