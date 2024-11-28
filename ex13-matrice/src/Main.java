import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriu =  {
                {5, 12, 7,4},
                {4, 8, 15,7},
                {9, 3, 10,5},
                {9, 3, 10,9},
        };

            for (int i = 0; i < matriu.length; i++) {
                int sumaF = 0;
                for (int j = 0; j < matriu[i].length; j++) {
                    sumaF += matriu[i][j];
                }
                System.out.println("la suma de la " + i + " fila es :" );
                System.out.print(sumaF);
                System.out.println();
            }

            /*suma de columnas  */
        for (int j = 0; j < matriu.length; j++){
            int sumaC = 0;
            for (int i = 0; i < matriu.length; i++){
                    sumaC += matriu[i][j];
                }

            System.out.print( "la suma de columna " + j +  " es :" + sumaC + " " );
            System.out.println();
            }

        /* la suma de la diagonal principal*/
        int sumaD1 = 0;
        for (int i = 0; i < matriu.length; i++) {
            sumaD1 += matriu[i][i];
        }
        System.out.println("la suma de la primera diagonal : " + sumaD1);

        /* la suma de la diagonal invertida*/
        int sumaD2 = 0;
        for (int i= 0;i< matriu.length; i++){
            sumaD2 += matriu[i][matriu.length-1-i];
        }
        System.out.println("la suma de la diagonal invertida : " + sumaD2);
        }
    }