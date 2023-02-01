import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 0, b= 1;

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print(a + " ");

        if (n > 1) {
            for (int i = 2; i <=n ; i++) {
                System.out.print(b + " ");

                int c = b;
                b = a + b;
                a = c;
            }

        }
    }
}