import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      // Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0, utilizando, y luego le pida al
        // usuario un valor real R. Por último, mostrará cuántos valores del array son igual o superiores a R.
         Scanner scanner= new Scanner(System.in);
         Random random = new Random();
       float[] num = new float[100];
         for (int i= 0;i < num.length;i++) {
          num[i] = random.nextInt(0,1);
      }
          System.out.println("Entra un valor R :");
          Float R = scanner.nextFloat();
          int contador =0;

          for (int i =0;i<num.length;i++){
              if (num[i] >= R) {
                  contador++;
              }
              }
        System.out.println("los valores que son iguales o superiores del elemenetos del array :" + contador);
              }
          }
