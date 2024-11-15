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
        int maslargo = sec1.length;
        if (sec2.length > maslargo) {
            maslargo = sec2.length;
        }
        for (int i = 0; i < maslargo; i++) {
            if (i < sec1.length) {
                System.out.print("" + sec1[i] + "" + sec2[i] + "");
            }
        }

    }
}
