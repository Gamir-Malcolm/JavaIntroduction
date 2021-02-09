//*Class 1st Feb 2021 *//

import java.util.Scanner;

public class Recursion {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number --->");
        int number = sc.nextInt();

        System.out.println(factorial(number));
    }

    public static int factorial(int x){
        if (x == 0){
            return 1;
        } else {
            return x * factorial(x-1);
        }
    }
}
