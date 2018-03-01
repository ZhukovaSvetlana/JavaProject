import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.Scanner;

public class Example17 {

    public static final int M = 6;
    public static final int N = 7;

    public static void main(String[] args) {
        Integer[][] a = new Integer[M][N];
        Random r = new Random();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = r.nextInt(10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 2; i <= 2 * N; i++)
            System.out.print("-");
        System.out.println();

        for (int i = 0; i < M; i++) {
            Arrays.sort(a[i], Collections.reverseOrder());
            for (int j = 0; j < N; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
