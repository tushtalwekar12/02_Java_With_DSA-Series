// Array as function argument  - 
public class Example02{
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1; // update 1 in original array element
        }
    }
    public static void main(String[] args) {
        int marks[] ={97,98,99};  //original array

        System.out.println("Before updating: ");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();  //for nextline

        System.out.println("after updating :");
        update(marks);   // call update methods
        // print our marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] +" ");
        }
        System.out.println();
    }
}