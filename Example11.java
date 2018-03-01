import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        System.out.println("Введите a");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("Введите b");
        int b = s.nextInt();
        long result=Math.round(Math.random()*(b-a) + a);
        System.out.println(result);
    }
}
