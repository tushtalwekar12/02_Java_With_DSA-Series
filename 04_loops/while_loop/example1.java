// date : 24-01-2025 - while Loops 
import java.util.Scanner;
public class example1{
    public static void main(String[] args) {
        // ex-1 print Hello world 10 times
        int counter =0;
        while(counter <10){
            System.out.println("Hello World");
            counter++;
        }

        // ex-2 print numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int range = sc.nextInt();
        int counter2 =1;
        // condition
        while( counter2 <= range){
            System.out.print(counter2 +" ");
            counter2++;
        }
        System.out.println();

        // ex-3 print sum of first n natural number
        int n=5;
        int sum = 0;
        int i = 1; // iterator
        while(i<=n){
            sum +=i;
            i++;
        }
        System.out.println("Sum of first "+ n +" natural number is "+ sum);
    }
}