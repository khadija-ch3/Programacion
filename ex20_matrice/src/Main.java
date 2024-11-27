import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//pedir filas y columnas
//verificar que esta ok
//imprimir
 int[][] num = {
                {5, 12, 7},
                {4, 8, 15},
                {9, 3, 10}
        };

        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int c = scanner.nextInt();

        if ( f < num.length && f >=0){
            if (c >=0 && c<num[f].length){
                System.out.println(num[f][c]);}
            else {
                System.out.println("fila mal");
            }

            }
        }
    }
}
