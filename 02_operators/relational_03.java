// Relational Operator - used to compare two values. They return a boolean value (true or false) based on the result of the comparison.
public class relational_03{
    public static void main(String[] args) {
        // 1. == equal to
        System.out.println(5 == 5); // true
        System.out.println(5 == 10); // false

        // 2.!= not equal to
        System.out.println(10 != 5); // true 
        System.out.println(10 != 10); // false

        // 3. > greater than 
        System.out.println(10 > 5); // true

        // 4. < less than 
        System.out.println(10 < 5); //false

        //5. >= greater than or equal to
        System.out.println(10 >= 10); // true
        System.out.println(10 >= 5); // true

        //6. <= less than or equal to 
        System.out.println(10 <= 10); // true
        System.out.println(10 <= 5); // false
    }
}