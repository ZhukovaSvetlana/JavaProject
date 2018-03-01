import java.util.Random;
import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        System.out.println("Загадана буква");
        Random r = new Random();
        int l=r.nextInt(26);
        char letter= (char)(l+97);
        Scanner s = new Scanner(System.in);

        boolean game=true;
        while (game) {
            System.out.println("Угадайте букву");
            char n = s.next().charAt(0);
            if (n==letter){
                System.out.println("Right");
                game=false;
            }
            else if (n < letter){
                System.out.println("You're too low");
            }
            else{
                System.out.println("You're too high");
            }
        }
    }
}
