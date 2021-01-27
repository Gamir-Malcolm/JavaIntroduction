import java.util.Scanner;

public class Salary {
    /* Closing group activity in class on Wed 20th Jan 2021 */

    public static void main(String[] args) {
        float payrate, hours, salary;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your full name then press [enter]:");
        name = sc.nextLine();

        System.out.println("Please enter the number of hours you worked: ");
        hours = sc.nextFloat();

        System.out.println("Please enter your pay rate: ");
        payrate = sc.nextFloat();

        salary = hours * payrate;

        System.out.println("Name: " + name);
        System.out.println("Pay Rate: $" + payrate);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Your Salary is: $" + salary);
    }
}
