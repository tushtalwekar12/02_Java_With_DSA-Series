// to build Calculator -  switch statement 
import java.util.*;
public class example_02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();

        System.out.println("Enter Second number :");
        int num2 = sc.nextInt();

        System.out.println("Enter operator (+, -, *, /, %) :");
        char operator =sc.next().charAt(0); // used charAt()- for enter single character

        switch(operator){
            case '+':
                System.out.println("Addition of two numbers is : "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction of two numbers is : "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication of two numbers is : "+(num1*num2));
                break;
            case '/':
                System.out.println("Division of two numbers is :"+ (num1/num2));
                break;
            case '%':
                System.out.println("Modulus of two numbers is : "+(num1%num2));
                break;
            default : System.out.println("not valid operator , Enter valid operator");        
        }
    }
}