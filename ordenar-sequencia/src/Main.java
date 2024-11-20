import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int [] prueba ={40,7,3,2};
//        if (prueba[0] > prueba[1]){
//            int aux = prueba[0];
//            prueba[0] = prueba[1];
//            prueba[1] = aux;
        int n= scanner.nextInt();
        int [] secuencia = new int[n];

        for (int i=0;i<secuencia.length;i++){
            secuencia[i] = scanner.nextInt();
        }
        boolean desordenado = true;
        while (desordenado){
            desordenado = false;
        for (int i=0;i<secuencia.length-1;i++){
            if (secuencia[i] > secuencia[i+1]) {
                desordenado = true;
                int aux = secuencia[i + 1];
                secuencia[i + 1] = secuencia[i];
                secuencia[i] = aux;
            }
            }
        }
        for (int i=0 ;i<secuencia.length ;i++){
            System.out.print( secuencia[i] + " ");
        }

    }

}