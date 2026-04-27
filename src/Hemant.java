import java.util.Scanner;
public class Hemant {
    public static void main(String[] argg){
        Scanner sc =new Scanner(System.in);
        int number;
        int digit;
        int reverse=0;
        System.out.println("enter the number");
        number=sc.nextInt();

        int temp=number;
        while(number !=0){
            digit=number%10;
            number=number/10;
            reverse= reverse *10+digit;
        }
        if(reverse==temp){
            System.out.print("this Palindrome number");
        }
        else{
            System.out.print("this is not a Palindrome number");
        }
    }
}

