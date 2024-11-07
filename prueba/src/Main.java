import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random r = new Random();
        float[] numeros = new float[10];
        //guardamos en un array
        for (int i=0; i < numeros.length; i++ ){
            numeros[i] = scanner.nextFloat();
        }
        // imprimir los numeros del array
        for (int i=0; i < numeros.length; i++ ){
            System.out.println("los numeros introduzcos :" + (i +1) );
            System.out.println(numeros[i]);
        }
    }
    }