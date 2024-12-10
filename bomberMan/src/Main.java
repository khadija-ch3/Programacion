import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int f = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] tablero = new int[f][c];
        // rellenar el array
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = scanner.nextInt();
            }
        }
        int e = scanner.nextInt();
        /* buscar la fila y la columna en la cual se explota
       imprimo una matriz de f x c , pero si estoy en la misma fila y columna @, sino #
         */
        int filaExplota = 0;
        int columnaExplota = 0;
       /* filas*/   for (int i = 0; i < tablero.length; i++) {
           /* columnas*/  for (int j = 0; j < tablero[i].length; j++) {
                if (e == tablero[i][j]) {
                    filaExplota = i;
                    columnaExplota = j;
                }
            }
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i == filaExplota || j == columnaExplota) {
                    System.out.print(" @ ");
                } else {
                    System.out.print(" # ");
                }
            }
            System.out.println();
        }
    }
}
