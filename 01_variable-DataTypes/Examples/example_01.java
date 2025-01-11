//sum of a & b - taking input from user
import java.util.Scanner;
public class example_01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int sum = a+b;
        int product = a*b;
        System.out.println("Sum of a & b is: "+sum);
        System.out.println("Product of a & b is: "+product);
    }
}