import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Donada una seqüència de números, dir si és capicua.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] capicua = new int[N];
        boolean esCapicua = true;

        for (int i = 0; i < capicua.length; i++) {
            capicua[i]= scanner.nextInt();
        }
        for (int i = 0; i < capicua.length/2; i++) {
            if (capicua[i] == capicua[capicua.length-1-i]) {
            }
            else {
                esCapicua= false;
                break;
            }
        }
        System.out.println(esCapicua);
        }
    }