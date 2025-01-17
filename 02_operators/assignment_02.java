// Assignment Operator - used to assign values to variables. - =, +=, -=, *=, /=, and %=
public class assignment_02{
    public static void main(String[] args) {
       int a =10; // =
       System.out.println("value of a :"+ a);

       // +=
       a +=5; // a = a+5;
       System.out.println("value of a after +=5 :"+ a); // 15

       // -=
       a -=5; // a = a-5;
       System.out.println("value of a after -=5 :"+ a); // 15 - 5 = 10

       // *=
       a *=5; // a =a*5;
       System.out.println("value of a after *=5 :"+ a); // 10*5 = 50

       // /=
       a /=5; // a = a/5;
       System.out.println("value of a after /=5 :"+ a); // 50/5 = 10

       a %=3; // a = a/3;
       System.out.println("value of a after %=3 :"+ a); // 10%3 = 1

       //Chaining Assignment Operators
       int x,y,z;
       x=y=z=22;
       System.out.println("value of x :"+ x); //22
       System.out.println("value of y :"+ y); //22
       System.out.println("value of z :"+ z); //22

       // Swapping Two Numbers Using a Temporary Variable
       int a1 =10;
       int b2 =20;
       int temp =a1;
       a1 = b2;
       b2 =temp;
       System.out.println("value of a1 after swapping :"+ a1); //20
       System.out.println("value of b2 after swapping :"+ b2); //10
    }
}