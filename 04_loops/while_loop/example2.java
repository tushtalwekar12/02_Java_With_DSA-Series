// print reverse of a number
import java.util.Scanner;
public class example2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        
        System.out.println("reverse of the number : ");

        while(n > 0){
            int lastdigit = n % 10; // to calculate lastdigit
            System.out.print(lastdigit); //  print last digit
            n = n / 10; // to remove last digit from number
        }
        System.out.println();
    }
}