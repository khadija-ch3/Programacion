import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

// Escriba un programa que tome un número y diga si es primo o no. Un número primo es un número que mayor que 1 y no se puede dividir más que por sí mismo.
// Pista: usa un loop para dividir el número por desde 2 hasta uno menos.
// Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("entra un número");
        boolean primo = true;
        int n = scanner.nextInt();
        for (int i =1 ; i<=n; i++)
        {
            if (n % i ==0){
                primo = false;
            }
            else if (n % i !=0 && n%n ==0) {
                primo= true;
            }
        }
        if (primo) {
            System.out.println("primo");
        }
        else if (primo=false)
        {
            System.out.println("no es primo");
        }
    }
}