import java.util.Scanner;
// дни отпуска: вторник и среда
public class Example3 {
    public static void main(String[] args) {
        boolean[][] days = new boolean[7][2]; //7 Дней
        // понедельник
        days[0][0] = true;// будний день
        days[0][1] = false; //отпуска нет

        //вторник
        days[1][0] = true;// будний день
        days[1][1] = true;

        //среда
        days[2][0] = true;// будний день
        days[2][1] = true;

        //четверг
        days[3][0] = true;// будний день
        days[3][1] = false;

        //пятница
        days[4][0] = true;// будний день
        days[4][1] = false;

        //суббота
        days[5][0] = false;
        days[5][1] = false;

        //Воскресенье
        days[6][0] = false;
        days[6][1] = false;

        int a;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите номер дня недели: ");
        a = s.nextInt();
        if (!(days[a-1][0]) || (days[a-1][1])){
            System.out.print("true");
        }
        else {
            System.out.print("false");
        }
    }
}
