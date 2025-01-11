// date : 11-01-2024 - primitive DataTypes  (8 types) - java 
public class datatypes{
    public static void main (String [] args){
        // 1. byte - size: 1byte , range : -128 to 127
        byte a = 20;
        System.out.println("byte data type : the value of a is :"+a);

        // 2. short - size: 2byte , range : -32,768 to 32,767  
        short b = 20000; // not much used 
        System.out.println("short data type : the value of b is :"+b);

        // 3. int - size: 4byte , range : -2,147,483,648 or -2B to 2,147,483,647 or +2B 
        int c = 2000000000; // most used
        System.out.println("int data type : the value of c is :"+c);

        // 4. long - size: 8byte , range : 
        long d = 2000000000000000000L;
        System.out.println("long data type : the value of d is :"+d);

        // 5. float - size: 4byte , range : up to 7 decimal digits
        float e = 2000000000.000000000f;
        System.out.println("float data type : the value of e is :"+e);

        // 6. double - size: 8byte , range : up to 15 decimal
        double f = 2000000000.000000000000000000000000000000;
        System.out.println("double data type : the value of f is :"+f);

        // 7. boolean - size: 1byte , range : true or false
        boolean g = true;
        System.out.println("boolean data type : the value of g is :"+g);

        // 8. char - size: 2byte , range : 0 to 255 characters representation of ASCII values
        char h = 'a';
        System.out.println("char data type : the value of h is :"+h);
    }
}
/*  1. it is type language it means tell the type of variable .
we need to declare the which type of datatype of variable .
*/