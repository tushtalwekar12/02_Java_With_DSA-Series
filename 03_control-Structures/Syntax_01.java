// syntax - if_else , else_if , switch etc 
public class Syntax_01{
    public static void main(String[] args) {
        //1. if_else syntax 
        if(10 < 20){ // (condition)
            System.out.println("10 is less than 20");
        }else{
            System.out.println("10 is not less than 20");
        }

        //2. else_if Syntax
        if(20 >= 30){ // check first condition
            System.out.println("20 is greater than or equal to 30");
        }
        else if(20 < 30){  // check second condition
            System.out.println("20 is less than 30");
        }else{ // if both are false then print else
            System.out.println("20 is not less than 30");
        }          
    }
}