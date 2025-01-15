// date : 15-01-2025
// Problem : Reverse an Array - 2,4,6,8,10
public class example1{
    public static void reverse(int numbers[]){
        int first=0;  // first index of the array
        int last=numbers.length -1; // last index of the array

        // for swapping
        while(first<last){
            int temp = numbers[last];
            numbers[last]=numbers[first]; // the value of the last index is replaced with the value of the first index
            numbers[first]=temp;;

            first++; // after swapping first is incremented by 1
            last--; // decremented by 1
        }
    }
    public static void main(String[] args) {
        int[] numbers ={2,4,6,8,10};  // given array

        reverse(numbers); // call
        // printing 
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
    }
}
// time complexity : O(n)