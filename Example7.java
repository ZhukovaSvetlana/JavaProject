import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите n = ");
        n = s.nextInt();
        int d = 1;
        while (d <= n) {
            if (n%d == 0) {
                System.out.print(d+" ");
            }
            d++;
        }
    }
}
