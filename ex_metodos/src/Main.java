import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        char[] palabra = scanner.nextLine().toCharArray();
        boolean faltaTodas = true;
        for (int i = 0; i < palabra.length; i++) {
            boolean faltaALGUNA = true;
            for (int j = 0; j < alfabeto.length; j++) {
                if (alfabeto[j] == palabra[i]) ;
                {
                    faltaALGUNA = true;
                }
            }
            if (faltaALGUNA) {
                faltaTodas = false;
                break;
            }
        }
        System.out.println(faltaTodas);


    }
}