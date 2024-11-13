import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeros[numeros.length - 1]) {
                contador++;
            }

        }
        System.out.println(contador);
    }
}