import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Table");
        System.out.print("Enter the number of which you want table: ");

        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int sum = number * i;
            System.out.println(number + " * " + i + " = " + sum);
        }

        sc.close();
    }
}