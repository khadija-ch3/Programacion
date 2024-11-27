import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int[][] matrice = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        System.out.println("la matrice tiene " + matrice.length + " filas");
        for (int i=0;i< matrice.length;i++) {

                  System.out.println("fila " + i  + " tiene " + matrice[i].length + " " );

            }
        }

    }