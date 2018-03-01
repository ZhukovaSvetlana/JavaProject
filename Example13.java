import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Example13 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        Random r = new Random();
        for(int i=0; i<n; i++){
            a[i]=r.nextInt(1000);
        }
        boolean go=true;
        while(go) {
            System.out.println("1.Вывести массив");
            System.out.println("2.Увеличить элемент массива на 10%");
            System.out.println("3.Выход");
            System.out.println("4.Сортировка массива");
            System.out.println();
            System.out.println("Введите номер операции");
            int x = s.nextInt();
            switch(x){
                case 1:
                    for(int i=0; i<n; i++){
                        System.out.print(a[i]+" ");
                    }
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Введите номер элемента массива, который вы ходите увеличить");
                    int m = s.nextInt();
                    a[m]*=1.1;
                    break;
                case 3:
                    go=false;
                    break;
                case 4:
                    Arrays.sort(a);
                    break;
            }

        }


    }
}
