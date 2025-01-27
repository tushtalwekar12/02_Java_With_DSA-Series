// count number of digits present in number 
public class example4{
    public static void main(String[] args) {
        int num = 9887;
        int count = 0;

        while(num > 0){
            num = num / 10;
            count++;
        }
        System.out.println("Number of digits in number " + count);
    }
}