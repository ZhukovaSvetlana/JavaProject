import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        System.out.println("Введите n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n+1];
        array[0]=0;
        array[1]=1;
        for(int i=0; i<n; i++) {
            System.out.print(array[i]+" ");
            array[i+2]=array[i]+array[i+1];
        }

    }
}
