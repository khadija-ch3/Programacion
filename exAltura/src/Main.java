import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();


        float[] kids = new float[N];

        for (int i = 0; i < kids.length; i++) {
            float M = scanner.nextFloat();
            kids[i] = M;
        }
        float R = scanner.nextFloat();


        for (int i = 0; i < kids.length; i++) {
            if (kids[i] >= R) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}