import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        int number;
        int digit;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        number = sc.nextInt();

        int temp = number;

        while (number != 0) {
            digit = number % 10;
            number = number / 10;
            sum = sum + digit * digit * digit;
        }

        if (temp == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}