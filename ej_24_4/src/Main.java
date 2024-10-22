import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Donada una seqüencia de números, imprimix els intervals entre cada parella de números consecutius.
        // 2  -3   5
      // 3   5   2   7  -1
        Scanner scanner= new Scanner(System.in);

        int n = 125470;
        int a = scanner.nextInt();
        while (n != -1)
        {
            n = scanner.nextInt();
//            if (a > n) {
                System.out.println(n - a);
//                a = n;
//            }
//
//            else if (a > n)
//            {
//
//                System.out.println(a-n);
//                a = n;
//
//            }
        }
    }
}