// print Sub-array 
public class Example1{
    public static void printSubArray(int[] numbers){
        int totalSubArray =0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print("{"+numbers[k]+"}"+" "); // print subarray
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub array :"+ totalSubArray); // total sum of sub array
    }
    public static void main(String[] args) {
        int[] numbers ={2,4,6,8,10};
        printSubArray(numbers);
    }
}