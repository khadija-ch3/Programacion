import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //5. Crea un programa que pida veinte números reales por teclado, los almacene en un array y luego lo recorra para
        // calcular y mostrar la media: (suma de valores) / nº de valores.
        Scanner scanner= new Scanner(System.in);
        float [] numeros = new float[20];
        float suma =0;
        float media =0;
        for (int i =0; i<numeros.length;i++){
            numeros[i] = scanner.nextFloat();
        }
        for (int i =0;i<numeros.length;i++){
            suma+= numeros[i];
        }
        media = suma / numeros.length;
        System.out.println("la suma de los elementos del array es:" + suma);
        System.out.println("la media es :" + media);
    }
}