import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        int i=0;
        System.out.print("Введите число a = ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String str = "" + a;
        int n = str.length();
        n--;
        int m=n;
        while (str.charAt(i)==str.charAt(n) && (n != m/2)){
            i++;
            n--;
        }
        if (n==m/2) {
            System.out.print("Палиндром");
        }
        else{
            System.out.print("Не палиндром");
        }
    }
}
