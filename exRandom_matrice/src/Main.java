import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[][] matrice = new int[2][3];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = random.nextInt(10, 20);
            }
        }
        //trasponer matriz
        int[][] zirtam = new int[3][2];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                zirtam[j][i] = matrice[i][j];
            }
        }
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " " );
            }
            System.out.println();
        }

        for (int i = 0; i < zirtam.length; i++) {
            for (int j = 0; j < zirtam[i].length; j++) {
                System.out.print(zirtam[i][j] + " " );
            }
            System.out.println();
        }


    }
}