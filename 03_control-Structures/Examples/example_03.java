// Ternary Operator - required 3 operand
// Syntax: condition ? value_if_true : value_if_false
// or : condition ? statement1 : Statement2
public class example_03{
    public static void main(String[] args) {
        // ex -1 
        int marks = 39;
        String result = (marks >= 35) ? "pass":"fail";
        System.out.println(result);

        // ex -2 odd or even
        int a = 23;
        String check = (a % 2 ==0)? "even":"odd";
        System.out.println(check);
    }
}