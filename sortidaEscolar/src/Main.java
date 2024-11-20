import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] pasan = new int[n];
        for (int i = 0; i < pasan.length; i++) {
            pasan[i] = scanner.nextInt();
        }

        //dorsal = 1 2 3 4 5

        // j =      0 1 2 3 4
        // pasan = [5,3,2,4,1]

        Boolean habiaTodo = true;
        for (int dorsal = 1; dorsal <= pasan.length; dorsal++) {
            boolean falta = true;
            for (int j = 0; j < pasan.length; j++) {
                if (dorsal == pasan[j]) {
                    falta = false;
                }
            }
            if (falta) {
                habiaTodo = false;
                break;

            }
        }

        if (habiaTodo) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}

