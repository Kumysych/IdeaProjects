import java.util.Scanner;
import java.util.Random;
public class sortirovka {
    public static void swap(int a, int b) {
        if(a>b){
            int t=a;
            a=b;
            b=t;
        }
    }
    public static void puzyr(int a[]) {
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a.length-1-i;j++) {
                swap(a[j],a[j+1]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Random rand = new Random();
        int n = cin.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=rand.nextInt((10)+1);
            System.out.print(a[i]+" ");
            System.out.println(puzyr(a[i]));
        }System.out.println(" ");

    }
}