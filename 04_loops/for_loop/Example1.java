// Ex- generating bills for customers in a shopping cart system.
// Here, we iterate through each item in the cart to calculate the total price.
public class Example1{
    public static void main(String[] args){
        // array of item price in the cart 
        double[] price = {12.99, 23.50, 5.75, 19.99, 8.49};

        double total =0;

        // for loop
        for(int i=0; i< price.length; i++){
            total += price[i];
        }
        System.out.println("total price :"+total);
    }
}