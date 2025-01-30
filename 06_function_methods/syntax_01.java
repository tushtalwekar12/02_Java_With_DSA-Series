// function syntax 
public class syntax_01{
    // int => return type
    public static int addOfTwo(int a , int b){ // we passed formal parameter
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        // call
        int result = addOfTwo(2,4); // at calling time we passed actual function 

        System.out.println(result);  // call function 

    }
}