import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] sec1 = new int[n];

        for (int i = 0; i < sec1.length; i++) {
            sec1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] sec2 = new int[m];
        for (int i = 0; i < sec2.length; i++) {
            sec2[i] = scanner.nextInt();
        }
        Boolean iguales = false;

        if (n != m) {
        }
        else {
            for (int i = 0; i < n; i++) {
                if (sec1[i] == sec2[i]) {
                    iguales = true;
                }
                else if (sec1[i] != sec2[i]) {
                    iguales = false;
                }
            }

        }
        System.out.println(iguales);
    }
}