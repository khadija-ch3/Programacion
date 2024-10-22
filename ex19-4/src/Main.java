import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


//        Escribe un programa que imprima los números primos entre 1 y 100.
//        Pista: usa un loop dentro de otro loop. El loop externo comprueba cada número, el loop interno comprueba si tiene divisores.
        par :
        for (int n =1 ;n<=100;n++)
        {
            for (int i=1 ; i<=100;i++)
            {
                if (n % i !=0)
                {
                    System.out.println("los numeros par son " + n);
                    break par;
                }
            }

        }

    }
}