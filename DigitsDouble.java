import java.util.Scanner;

public class DigitsDouble {

        public static void main(String[] args) {
            int a = 0;
            int c = 0;
            int i = 0;
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
            c = a;
            while (a!=0) {
                a = a /10;
                i++;
            }
            if (i==1) {
                System.out.println("No doubles");
                return;
            }
            int mas[] = new int[i];
            for (int j=0; j<i ; j++){
                mas[j]=c%10;
                c=c/10;
            }
            for (int z=0; z<i-1; z++) {
                for (int x=z+1; x<i; x++){
                    if (mas[z]==mas[x]){
                        System.out.println("Doubles exists");
                        return;
                    }
                }
            }
            System.out.println("No doubles");
        }
    }

