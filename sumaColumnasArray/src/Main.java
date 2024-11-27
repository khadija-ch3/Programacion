import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] nums = new int[n][m];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }

        int[] suma = new int[m];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                suma[j] += nums[i][j];
            }
        }

        for (int j = 0; j< suma.length; j++) {
            System.out.print(suma[j] + " ");
        }
        System.out.println();
    }
}