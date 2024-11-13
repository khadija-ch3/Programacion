import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crea un array de 20 booleans, i estableix els elements en els índexs indicats a true.
// Una sèrie de números enters que representen l'índex dels elements que han de ser true. La sèrie acaba amb un -1.
        Scanner scanner= new Scanner(System.in);
        boolean[] elementos = new boolean[20];
        int N = scanner.nextInt();
        while (N!= -1){
            elementos[N] =true;
            N = scanner.nextInt();;
        }
        System.out.println(Arrays.toString(elementos));
    }
}