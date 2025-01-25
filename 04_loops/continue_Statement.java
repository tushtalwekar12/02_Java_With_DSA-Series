// continue is used for to skip an iteration .
public class continue_Statement{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            if(i == 3){
                continue; // if i is 3 skip these iteration 
            }
            System.out.println(i);
        }
    }
}