// date : 18-01-2025
// Switch statement 
public class example_01{
    public static void main(String[] args) {
        int day = 8;
        switch(day){ // passed variable
            case 1:  
                System.out.println("today is Monday");
                break; // used to break given statement
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            default : System.out.println("today is Saturday");
        }
    }
}