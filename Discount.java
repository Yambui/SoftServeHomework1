import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        double sum;
        double dis;
        double result;
        Scanner s = new Scanner(System.in);
        System.out.println("Plz imput order sum");
        while (true){
            if (s.hasNextDouble()) {
                sum = s.nextDouble();
                break;
            }
            else  {
                System.out.println("imput incorrect must be double");
                s.nextLine();
            }
        }
        do {
            System.out.println("Plz imput discount 0 to 25%  ");
            while (!s.hasNextDouble()) {
                    System.out.println("imput incorrect must be double");
                    s.nextLine();
                }
            dis = s.nextDouble();
        } while ((dis>25)||(dis<0));
        result = sum - sum * dis / 100;
        System.out.println("Payment sum " + result);
    }
}
