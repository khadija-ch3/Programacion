import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int f = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] tablero = new int[f][c];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                if (tablero[i][j] == 1) {
                    System.out.println(1);
                } else {
                    int numMinas = 0;
                    if (i - 1 >= 0 && j - 1 >= 0) {
                        numMinas += tablero[i - 1][j - 1];
                    }

                    if (i - 1 >= 0) {
                        numMinas += tablero[i - 1][j];
                    }
                    if (i - 1 >= 0) {
                        numMinas += tablero[i - 1][j + 1];
                    }
                    if (j - 1 >= 0) {
                        numMinas += tablero[i][j - 1];
                    }
                    if (j + 1 < tablero[i].length) {
                        numMinas += tablero[i][j + 1];
                    }
                    if (i + 1 >= 0 && j - 1 >= 0) {
                        numMinas += tablero[i + 1][j - 1];
                    }
                    if (i - 1 >= 0 && j - 1 >= 0) {
                        numMinas += tablero[i + 1][j];}

                        if (i + 1 < tablero.length) {
                            numMinas += tablero[i + 1][j + 1];
                        }

                        System.out.print(numMinas);
                    }
                }
                System.out.println();
            }
        }

    }
}