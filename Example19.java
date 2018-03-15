import java.util.Scanner;

public class Example19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длины сторон треугольника");
        System.out.print("Введите а = ");
        int a = in.nextInt();
        System.out.print("Введите b = ");
        int b = in.nextInt();
        System.out.print("Введите с = ");
        int c = in.nextInt();
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
            if ((b * b + c * c - a * a == 0) || (a * a + c * c - b * b == 0) || (b * b + a * a - c * c == 0))
                System.out.println("Треугольник прямоугольный");
            else if ((b * b + c * c - a * a < 0) || (b * b + c * c - a * a < 0) || (b * b + c * c - a * a < 0))
                System.out.println("Треугольник тупоугольный");
            else
                System.out.println("Треугольник остроугольный");
        }
        else
            System.out.println("Треугольник невозможен");
    }
}
