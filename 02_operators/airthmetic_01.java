// date : 17-01-2025 - 1. Airthmetic Operator 
public class airthmetic_01{
    public static void main(String[] args) {
        //1. Binary Operator - required 2 Operand
        int num1 = 20;
        int num2 = 10;
        System.out.println("Addition of num1 + num2 is : "+ (num1+num2));
        System.out.println("Subtraction of num1 - num2 is : "+ (num1 - num2));
        System.out.println("Multiplication of num1 * num2 is : "+ (num1*num2));
        System.out.println("Division of num1 / num2 is : "+ (num1/num2));
        System.out.println("Modulus of num1 % num2 is : "+ (num1 % num2));

        // 2. Unary Operator - required 1 Operand 
        int num3 = 30;
        System.out.println("Value of num3 is : "+ (--num3)); //29

        //Pre-Increment and Post-Increment
        int x =5; 
        System.out.println(++x); // pre  - 6
        System.out.println(x++); // post -6 actual value -7

        //Pre-Decrement and Post-Decrement
        System.out.println(--x); //6
        System.out.println(x--); //6 actual value -5

    }
}