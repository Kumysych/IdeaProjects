import java.util.Scanner;
class teylor {
    public static double power(double x, int n){
        double p;
        p = 1;
        for (int i = 1; i <= n; i++){
            p *= x;
        }
        return p;
    }
    public static long fact(int n){
        long F;
        F = 1;
        for (int i = 1; i <= n; i++){
            F *= i;
        }
        return F;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int  n = cin.nextInt();

        double x=1, Sum;
        Sum = 1;
        for (int i = 1; i <= n; i++){
            Sum += power(x, i)/fact(i);
        }
        System.out.println(Sum);
    }
}