import java.util.Scanner;

public class Sum {
    /* Activity done in class before I came in on Wed 20th Jan 2021*/

    public static void main(String [] args) {
        int num1, num2, sum;

        Scanner sc = new Scanner(System.in);

        System.out.println("This program allows you to find the sum of two integers.");

        System.out.println("Enter the 1st number: ");
        num1 = sc.nextInt();

        System.out.println("Enter the 2nd number: ");
        num2 = sc.nextInt();

        sum = num1 + num2;

        System.out.println("The sum of the numbers is: " + sum);

    }

}
