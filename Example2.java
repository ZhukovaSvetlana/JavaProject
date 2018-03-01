import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        int a,b, result, r;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите a = ");
        a = s.nextInt();
        System.out.print("Введите b = ");
        b = s.nextInt();
        result = a/b;
        r = a%b;
        System.out.println(a + " / " + b + " = " + result + " и " + r + " в остатке" );
    }
}
