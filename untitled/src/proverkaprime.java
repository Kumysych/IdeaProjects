import java.util.Scanner;
public class proverkaprime {
    public static void main(String[] args) {
        System.out.println("Введите положительное число: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int del = 2;
        int j = 1;
        int prime = num;
        while (prime - j == 1)
        {
            while (prime - j == 1)
            {
                prime = prime - j;
            }
            System.out.println("prime number");
        }

        while (num > 1) {

            while (num % del == 0) {
                System.out.println(del);
                num = num / del;
            }
            del++;

        }

    }
}