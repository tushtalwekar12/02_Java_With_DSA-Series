// Linear search - find the index of element in a given array.
// key=10 and array={2,4,6,8,10,12,14,16}

public class linear_search03{
    public static int LinearSearch(int numbers[], int key){
        for(int i=0;  i<numbers.length; i++){
            if(numbers[i] == key){
                return i;  // if present return i 
            }
        }
        return -1;  // if not present return -1 

    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10,12,14,16};
        int key = 10;  // key to find in numbers array

        int index = LinearSearch(numbers,key); //call method 

        if(index == -1){
            System.out.println("Element is not present in array");
        }else{
            System.out.println("Element is present at index " + index);
        }
    }
}