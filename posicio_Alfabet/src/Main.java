import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] alfabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] texto = scanner.nextLine().toCharArray();

        // if (texto.length >= alfabet.length) {

        for (int i = 0; i < texto.length; i++) {
            for (int j = 0; j < alfabet.length; j++)
                if (texto[i] == alfabet[j]) {
                    System.out.println(j);
                }
        }
        }
    }
