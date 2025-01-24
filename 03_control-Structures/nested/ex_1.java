// Problem: Scholarship Eligibility
import java.util.*;
public class ex_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Percentage :");
        int percentage =sc.nextInt();

        System.out.println("Enter Your Family Income :");
        int income = sc.nextInt();

        // first condition 
        if(percentage >= 90){
            if(income < 50000){
                System.out.println("You are Eligible for full Scollership");
            }else{
                System.out.println("You are Eligible for Partial Scollership");
            }
        }
        // second condition
        else if(percentage >= 70 && percentage < 90){
            if(income < 50000 ){
                System.out.println("You are Eligible for partial Scollership");
            }else{
                System.out.println("You are not Eligible for Scollership");
            }
        }else{
            System.out.println("You are not Eligible for Scollership");
        }
    }
}