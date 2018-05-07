import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        int a;
        int b =0;
        Scanner s = new Scanner(System.in);
        System.out.println("Please imput number");
        while (true) {
            if (s.hasNextInt()) {
                a = s.nextInt();
                break;
            } else {
                System.out.println("imput incorrect must be int");
                s.nextLine();
            }
        }
        while (a!=0) {
            b = b + a%10;
            a = a /10;
        }
        System.out.println("Digits sum  " + b);
    }
}
