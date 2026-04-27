import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, number;
        boolean prime = true;

        System.out.println("Enter the number");
        number = sc.nextInt();

        if (number <= 1) {
            prime = false;
        } else {
            for (i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");
    }
}