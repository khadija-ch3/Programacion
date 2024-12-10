import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = {5, 3, 2, 8, 9, 7, 8};

        for (int i = a.length / 2; i >= 0; i--) {
            System.out.print(" " + a[i] + " ");
        }
        for (int i = a.length / 2 + 1; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println();

        for (int i = 1; i < a.length/2+1; i++) {
            System.out.print(" " + a[a.length / 2 - i]);
            System.out.print(" " + a[a.length / 2 + i]);

        }


    }
}