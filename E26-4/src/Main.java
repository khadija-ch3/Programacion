import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean abierta = true;
        int n = scanner.nextInt();
        while (n != -1)
        {
            for (int i =0; i< n; i++){
                for (int j = 0;j<=i; j++){
                    for (int k =0; k <= j; k++){
                        if( n == i *  j * k){
                            abierta = true;
                        }
                    }
                }
            }
        }
        if (abierta){
            System.out.println("abierta");
            System.out.println(\033[31m "hello world");
        }
        else {
            System.out.println("cerrada");
        }
    }
}
