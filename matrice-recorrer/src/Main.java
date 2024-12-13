import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String texto = "hola mundo";

        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }
        //otra solucion, conviertiendo el texto en un array
        //observa que el aRRAY SE ACCEDE CON [i]
        //y a los

        char[] textArray = "hola mundo".toCharArray();

        for (int i = 0; i < textArray.length; i++) {
            System.out.println(textArray[i]);


        }

    }

}