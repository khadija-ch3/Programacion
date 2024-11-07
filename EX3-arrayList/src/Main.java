import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      //  Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego lo recorra para averiguar el
        //  máximo y mínimo y mostrarlos por pantalla.
        Scanner scanner = new Scanner(System.in);
        float [] numeros = new float[10];
        for (int i =0; i< numeros.length ; i++){
            numeros[i] = scanner.nextFloat();
        }
        float min = Float.MAX_VALUE;
        for (int i = 0; i < numeros.length;i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
            float max = Float.MIN_VALUE;
            for (int i= 0; i< numeros.length ;i++){
                if (numeros[i]> max)
                {
                    max = numeros[i];
                }
            }
            System.out.println("le maxim del elementos del array :" + max);
            System.out.println("le minim del elementos del array :" + min);
    }
}