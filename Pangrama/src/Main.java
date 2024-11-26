import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] alfa = "abcdefghijklmnñoprstuvwxyz".toCharArray();
        char[] text = scanner.nextLine().toCharArray();

        boolean tieneTodas = true;
        for (int i=0 ;i < alfa.length ;i++){
            boolean faltaLitra = true;
            for ( int j=0;j< text.length;j++){
                if (alfa[i] == text[j]){
                    faltaLitra = false;
                }
            }
            if (faltaLitra){
                tieneTodas = false;
                break;
            }
        }
        System.out.println(tieneTodas);

    }
    }

