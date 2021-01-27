import java.util.Scanner;
//* completed in class on 25th Jan 21 *//
public class RelationalStatements {

    public static void main (String [] args ){

        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter quantity");
        int quantity = sc.nextInt();

        if (quantity < 100) {
                System.out.println("No discount");
           } else if(quantity >= 100 && quantity <= 120){
                System.out.println ("You get 10% discount");
           } else {
               System.out.println("You get 15% discount");
            }

    }

}
