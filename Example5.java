import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        int a,b,s;
        Scanner ss = new Scanner(System.in);
        System.out.print("Введите a = ");
        a = ss.nextInt();
        s=0;
        while (a != 0){
            b = a % 10;
            a = a / 10;
            s=s+b;
        }
        System.out.print("Сумма "+s);
    }
}
