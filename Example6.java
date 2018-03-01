import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        double Pe, Pm;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите силу тяжести на земле ");
        Pe = s.nextDouble();
        Pm = 0.17*Pe;
        System.out.print("Вес на луне "+Pm);
    }
}
