// date : 16-1-205 
// problems - pairs in array 
public class example2{
    public static void printPairs(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i]; // current index - 2,4,6...
            // nested for loop
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+curr +","+numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] numbers ={2,4,6,8,10};
        printPairs(numbers);
    }
}