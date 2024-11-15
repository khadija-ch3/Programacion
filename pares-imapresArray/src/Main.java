import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] secuencia = new int[n];
        for (int i = 0; i < secuencia.length; i++) {
            secuencia[i] = scanner.nextInt();
        }
        for (int i = 0; i < secuencia.length; i++) {
            /*
            * for (int i = 0; i < secuencia.length; i+=2) {
            * otra metodo para resolverlo
            * */

            if (i % 2 == 0) {
                System.out.print(secuencia[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < secuencia.length; i++) {
            /*
             * for (int i = 1; i < secuencia.length; i+=2) {
             * otra metodo para resolverlo
             * */
            if (i % 2 != 0) {
                System.out.print(secuencia[i] + " ");
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < secuencia.length; i++) {
            if (secuencia[i] % 2 == 0) {
                System.out.print(secuencia[i] +" ");
            }
        }
        System.out.println();
        for (int i = 0; i < secuencia.length; i++) {
            if (secuencia[i] % 2 != 0) {
                System.out.print(secuencia[i]+" ");
            }
        }
    }
}