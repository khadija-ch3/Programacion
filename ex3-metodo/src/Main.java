public class Main {
    public static void main(String[] args) {


        String texto = "hola(mundo)cruel";

        // charAt dime el caracter en (la posicion tal)
        // indexOf dime la posicion de (caracter tal)

        int posAbre = texto.indexOf('(');    //  "("  tendra el valor 5
        int posCierra = texto.indexOf(')');    //11

        String parte = texto.substring (posAbre+1,posCierra);

        for (int i=0; i< parte.length();i++) {
            System.out.println(parte.charAt(i));
        }

        /*
        String texto = "hola-mundo-cruel";

        int posAbre = texto.indexOf('-');    //   5
        int posCierra = texto.lastIndexOf('-');    //11
*/

    }
}