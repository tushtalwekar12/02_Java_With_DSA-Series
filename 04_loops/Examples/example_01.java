// date: 13-01-2025
//Problem: Find the sum of all elements in an array.
public class example_01{
    public static void main(String[] args) {
        // create an array
        int[] numbers ={12,13,14,15,20,30};
        int sum=0; // create empty variable 

        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];  // sum = sum+numbers[i]
        }
        System.out.println("sum of the array element :"+ sum);
    }
}