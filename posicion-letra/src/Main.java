import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] texto = scanner.nextLine().toCharArray();
        char[] letra = scanner.nextLine().toCharArray();

        boolean missing = true;
        for (int i = 0; i < texto.length; i++) {
            if (texto[i] == letra[0]) {
                missing= false;
                System.out.println(i);
                break;
            }
        }

        if (missing){
            System.out.println(-1);
        }
    }
}