import java.util.Scanner;
public class Main {
    {
       //4. Crea un programa que pida veinte números enteros por teclado, los almacene en un array y luego muestre por separado
        // la suma de todos los valores positivos y negativos.
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[20];

        int sumaP =0;
        int sumaN =0;
        for (int i =0;i<numeros.length;i++){
         numeros[i]= scanner.nextInt();
            if ( numeros[i] > 0){
                sumaP+= numeros[i];}
       else if ( numeros[i] < 0) {
            sumaN += numeros[i];
        }
        }
        System.out.println("la suma de los positivos : " + sumaP);
        System.out.println("la suma de los negativos: " + sumaN);
    }
}