// find factorial of n 
public class Example2{
    public static int factorial(int n){
        int f = 1;  // factorial

        for(int i =1; i<=n ; i++){
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));

    }
}