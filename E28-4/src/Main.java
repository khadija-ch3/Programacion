import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entra el numero");
        int n = scanner.nextInt();
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i ; j++){
                for (int k = 1; k<=j; k++){
                    if (i * j * k == n)
                        System.out.println(i + "x" + j + "x" + k);
                }
            }
        }
    }
}



/*



 */