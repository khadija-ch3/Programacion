import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] matriz = new char[0][];
        boolean habiaL = true;

        while (true) {
            char[] linea = scanner.nextLine().toCharArray();
            if (linea.length == 0) break;
            habiaL = false;

                char[][] nuevaMatriz = new char[matriz.length + 1][];
                for (int i=0 ;i< matriz.length;i++) {
                    // something missing her
                    nuevaMatriz[matriz.length] = linea;
                    matriz = nuevaMatriz;
                }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

