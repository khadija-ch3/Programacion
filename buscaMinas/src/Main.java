import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] nums = new int[n][m];

        for (int i = 0 ; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; i++) {
                nums[i][j] = scanner.nextInt();
            }
        }
        int fila = scanner.nextInt();
        int columna = scanner.nextInt();

        while (fila != 0 && columna != 0) ;
        //si en la posicion x y de la matriz
        // hay un 1, escribe SI, sino "no"
        {
            columna = scanner.nextInt();
            fila = scanner.nextInt();
            for (int i = 0; columna < nums.length; columna++) {
                for (int fila= 0; fila < nums[fila].length; fila++) {

                    if (nums[columna - 1][fila - 1] == 0) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                    fila = scanner.nextInt();
                }
                columna = scanner.nextInt();

            }
        }

    }
}

