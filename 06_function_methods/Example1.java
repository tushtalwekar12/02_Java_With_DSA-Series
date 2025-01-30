// find product of a & b 
public class Example1{
    public static int multiply(int a , int b ){
        int product = a * b ;
        return product;
    }
    public static void main(String[] args) {
        int prod = multiply(2,4);
        System.out.println("Product of 2 & 4 is : " + prod);

        System.out.println("Product of 5 & 6 is : "+ multiply(5,6));

        // or 
        int x = 10;
        int y = 20;
        int multi = x * y;
        System.out.println("x multiply by y : "+ multi);
    }
}