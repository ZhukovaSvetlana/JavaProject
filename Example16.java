import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        System.out.print("Введите количество полок ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c=0;
        for (int i=1; i<=n; i++){
            String str = String.valueOf(i);
            if(str.indexOf('2') != -1){
                c++;
            }

        }
        System.out.println("Количество бракованных полок: "+ c);
    }
}
