import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       //Donada un seqüència de números, mostra-la en ordre invers
        //
        //Entrada
        //
        //El primer número N indica la quantitat de números que hi ha en la seqüència.
        //A continuació venen els números de la seqüència.
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int []table = new int[n];

        for (int i=0;i< table.length;i++){
            table[i]= scanner.nextInt();
        }
        for (int i=0;i< table.length;i++){
            System.out.println(table[table.length-1-i]);
        }

//for (int i= numeros.length-1;i>=0;i++)
       // System.out.println(table[i]);
    }
}