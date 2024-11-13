import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        String [] apuntes = new String[n];
        for (int i=0;i<n;i++){
            int numPagina = scanner.nextInt();
            String contenido= scanner.nextLine();

            apuntes[numPagina-1] = contenido;
        }
    for (int i= 0; i< apuntes.length;i++){
        System.out.println(i + 1 + apuntes[i]);
    }
    }
}