import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String[] viejos = new String[n];

        for (int i=0; i<n; i++){
            viejos[i] = scanner.nextLine();
        }
        String nuevo = scanner.nextLine();

        boolean corecto = false;

        for (int i= 0; i<viejos.length;i++){
            if (viejos[i].equals(nuevo)){
                corecto= true;
            }
        }
        System.out.println(corecto);
    }
}