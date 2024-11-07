import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //2. Crea un programa que pida diez números reales por teclado,los almacene en un array,y luego muestre la
        // suma de todos los valores.
        //creamos el Array
        Scanner scanner= new Scanner(System.in);
        float []numeros = new float[5];
        for (int i =0; i< numeros.length ; i++){
            numeros[i]= scanner.nextFloat();
        }

        float suma =0;
        for (int i =0 ;i < numeros.length ;i++){
            suma += numeros[i];
        }
        System.out.println("la suma de los elementos del ARRAY :");
        System.out.println(suma);






    }

}