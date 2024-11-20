import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] teclado = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V", "B", "N", "M"};
        int n = scanner.nextInt();
        int[] ordenes = new int[n];
        for (int i = 0; i < ordenes.length; i++) {
            ordenes[i] = scanner.nextInt();
        }
        int posicion = 0;
        for (int i = 0; i < ordenes.length; i++) {
            posicion += ordenes[i];
            if (posicion < 0) {
                posicion = 0;
            } else if (posicion > teclado.length - 1) {
                posicion = teclado.length - 1;
            } else {
                //aqui faltan unos if
                System.out.print("" + teclado[posicion] + "");

            }
        }
    }
}