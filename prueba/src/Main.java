import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        char [] alfa = "abcdefghijklmnñoprstuvwxyz".toCharArray();
        char [] text = scanner.nextLine().toCharArray();
        int c=0;
        for (int i= 0 ; i< alfa.length;i++){
            for (int j =0;j<text.length;j++){
                if (alfa[i] == text[j]){
                    c++;
                }
                else {
                    break;
                }

            }
        }
        boolean hayLitras = true;
        for (int i=0 ;i<alfa.length;i++){
            if (i == c){
                hayLitras= true;
            }
            else {
                hayLitras= false;
            }
        }
        System.out.println(hayLitras);

        }
    }