import java.util.Scanner;
import java.nio.file.attribute.UserDefinedFileAttributeView;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        for (int i =1; i<=n;i++){
            for (int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

         }
}