// problem 1: to calculate max-subarray sum - by brute force 
public class Example2{
    public static void maxSubarraySum(int[] numbers){
        int currsum =0;
        int maxsum =Integer.MIN_VALUE;  

        for(int i=0; i<numbers.length; i++){
            int start =i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currsum =0;
                for(int k=start; k<=end; k++){ // printing
                    // sub array sum
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max subarray sum is "+maxsum); 
    }
    public static void main(String []args){
        int[] numbers ={2,4,6,8,10};
        maxSubarraySum(numbers); // call
    }
}