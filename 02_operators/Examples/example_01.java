// Example of Relational Operator 
import java.util.*;
public class example_01{
    public static void main(String[] args) {
        // 1. Compare Two Numbers 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 =sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 =sc.nextInt();
        if (num1 >= num2){
            System.out.println(num1 + " is greater than or equal to " + num2);
        }
        else{
            System.out.println(num1 + " is less than " + num2);
        }

        // 2. Check Voting Eligibility
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not Eligible to vote");
        }

        // 3. Leap Year Checker
        System.out.println("Enter year:");
        int year = sc.nextInt();

        if((year % 4 ==0)&&(year % 100 != 0 || year % 400 ==0)){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }

        //4. Maximum of Three Numbers
        System.out.println("Enter first number:");
        int number1 = sc.nextInt();
        System.out.println("Enter second number:");
        int number2 = sc.nextInt();
        System.out.println("Enter third number:");
        int number3= sc.nextInt();
        if (number1 >= number2 && number1 >= number3){
            System.out.println(number1 + " is the maximum number");
        }
        else if (number2 >= number1 && number2 >= number3){
            System.out.println(number2 + " is the maximum number");
        }
        else{
                System.out.println(number3 + " is the maximum number"); 
            }
    }
}