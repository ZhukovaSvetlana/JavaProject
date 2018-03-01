import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        System.out.println("Введите n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int p = 2; p <= n; p++) {
            long imax=Math.round(Math.sqrt(p));
            int i=2;
            while ((i<=imax) && (p % i != 0)) {
                i++;
            }
            if ((i > imax) && (p!=1)) {
                System.out.print(" "+ p);
            }
        }
    }
}
