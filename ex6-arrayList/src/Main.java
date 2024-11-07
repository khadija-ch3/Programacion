import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N, escriba M en todas sus posiciones y
        // lo muestre por pantalla.
        System.out.println("entra dos valores:");
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int [] numeros = new int[N];
        for (int i=0 ;i<numeros.length; i++){
            numeros[i] = M;
        }
        System.out.println(numeros[M]);


    }
}