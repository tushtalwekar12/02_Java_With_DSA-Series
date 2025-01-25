import java.util.Scanner;
public class break_Statement{
    public static void main(String[] args) {
       // break statement - for loop
       for(int i=1; i<=5; i++){
        if (i==4){
            break; // exit loop
        }
        System.out.println(i);
       }
       System.out.println("i am out of the loop");

       // ex-2 keep entering the number till user enter the multiple of 10
       Scanner sc =new Scanner(System.in);
       do{
        System.out.print("enter the number : ");
        int n = sc.nextInt();

       // check n is multiple of 10 or not 
        if(n % 10 == 0){
            System.out.println(n + " is multiple of 10");
            break; // exit 
        }
        System.out.println(n + " not a multiple of 10.");
       }while(true); 
    }
}