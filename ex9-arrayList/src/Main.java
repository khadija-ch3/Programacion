import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       //Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros aleatorios entre 1 y 10.
        // Luego pedirá un valor N y mostrará en qué posiciones del array aparece N.
        Scanner scanner= new Scanner(System.in);
        Random random= new Random();
        int [] numeros = new int[100];
        for (int i= 0; i< numeros.length;i++){
            numeros[i] = random.nextInt(1,10);
        }
        System.out.println("entra un valor");
        int n = scanner.nextInt();

        for (int i=0;i<numeros.length;i++){
            if ( numeros[i]== n){
                System.out.println(i);
            }
        }
    }
}