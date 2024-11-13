import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores
// del primer array al segundo array en orden inverso, y mostrar ambos por pantalla
        int[] enteros = new int[10];
        int[] otro = new int[10];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i + 1;
        }
        for (int i = 0; i < enteros.length; i++) {
            otro[i] = enteros[i];
        }
        for (int i = 0; i < otro.length; i++) {
            otro[i] = enteros[enteros.length - 1 - i];
        }
        for (int i = 0; i < enteros.length; i++) {
            System.out.print(enteros[i] + " " );
        }
        System.out.println();
        for (int i = 0; i < otro.length; i++) {
            System.out.print(otro[i] +  " " );
        }


    }
}