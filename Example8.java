import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите n = ");
        n = s.nextInt();
        int i=2;
        boolean b=true;
        while ((i <= Math.sqrt(n))&&(b)) {
            if ((n%i) == 0) {
                System.out.print("Составное");
                b=false;
            }
            i++;
        }
        if (b) {
            System.out.print("Простое");
        }
    }
}
