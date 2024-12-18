import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //* la palabra mas larga de una frase
        Scanner scanner = new Scanner(System.in);
        String frase = "zz aaaa nn bbbbb";
        // * usar split para
        String[] palabra = frase.split(" ");

       // int posMax = 0;
        //for (int i = 0; i < palabra.length; i++) {
       //     if (palabra[i].length() > palabra[posMax].length()) {
            //    posMax = i;

         //   }
     //   }
      //  System.out.println("la palabra más larga es :" + palabra[posMax]);
      //  System.out.println("y tiene " +  palabra[posMax].length() + " letras");
      //  System.out.println("su posición es " + posMax);


        //segunda forma de hacerlo
        int pos =0;
        String masLarga= palabra[0];
        for (int i = 0; i < palabra.length ; i++) {
            if (palabra[i].length() > masLarga.length()){
                masLarga= palabra[i];
                pos =i;
            }

        }
        System.out.println("la palabra mas larga es:" + masLarga);




    }
}