import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, a, b = 0, c = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Lütfen eleman sayısını giriniz  :");
        n = s.nextInt();
        System.out.print(n + " Elemanlı Fibonacci Serisi:");
        for (int i = 1; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");
        }
    }
}