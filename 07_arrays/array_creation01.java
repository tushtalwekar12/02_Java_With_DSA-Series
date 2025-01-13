//date: 13-01-2025 - creation of array
public class array_creation01{
    public static void main(String[] args) {
        int numbers[] = new int[3]; // array size is 3 and we can't change the size of array in runtime 

        int numbersValue[] = {12,13,20,23,25}; // array size is 5

        String fruits[] ={"apple", "banana", "mango"};

        // printing 
        System.out.println("Numbers array size: "+numbers.length); // gives size of array 
        System.out.println(numbersValue[0]); 

    }
}