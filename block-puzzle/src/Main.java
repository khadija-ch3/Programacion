import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] tablero = new int[n][m];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = scanner.nextInt();
            }
        }
        int[][] ficha = new int[n][m];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                ficha[i][j] = scanner.nextInt();
            }
        }

        boolean habia = true;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == ficha[i][j] && tablero[i][j] == 1) {
                    habia = false;
                }
            }
        }

        System.out.println(habia);
    }

}
