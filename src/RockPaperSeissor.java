import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RockPaperSeissor {
    public static boolean isWin(char computer, String user) {
        return true;
    }

    public static char computerChoise(char cases) {

        int n = (int)(Math.random() * 2);
        return  cases[n];
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char[] cases = {'r','p','s'};
        System.out.print("Enter '0' for Rock , '1' for Paper and '2' for Seissor :");
        String userInput = sc.next();
        char computerInput = computerChoise(cases);

        boolean result = isWin(computerInput,userInput);

        if (result){
            System.out.println("You Won!");
        }else {
            System.out.println("You Loss!");
        }

    }
}
