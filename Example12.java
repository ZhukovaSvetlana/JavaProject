import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        System.out.print("Введите строку ");
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.print("Введите номер удаляемого элемента ");
        int n = s.nextInt();
        for (int i=0; i<str.length(); i++) {
            if (i != n) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
