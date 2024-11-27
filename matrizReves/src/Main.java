import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][]matriz = new int[n][m];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
     int [][] zirtam = new int[m][n];
        for (int i = 0; i < zirtam.length; i++) {
            for (int j = 0; j < zirtam[i].length; j++) {
                zirtam[zirtam.length-1-j][zirtam.length-1-i] = matriz[i][j];
            }
            }

        for (int i = 0; i < zirtam.length; i++) {
            for (int j = 0; j < zirtam[i].length; j++) {
                System.out.println(zirtam[i][j] + "");
            }
            System.out.println();
            }

       }
       }