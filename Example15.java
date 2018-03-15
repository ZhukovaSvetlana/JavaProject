import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите коэффициенты квадратного уравнения");
        System.out.print("Введите а = ");
        a = s.nextDouble();
        System.out.print("Введите b = ");
        b = s.nextDouble();
        System.out.print("Введите c = ");
        c = s.nextDouble();
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x2 = (-b + Math.sqrt(D)) / (2 * a), x1 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x = " + x);
        }
        else
            System.out.println("Корней нет");


    }
}
