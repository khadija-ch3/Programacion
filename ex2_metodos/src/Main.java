public class Main {
    public static void main(String[] args) {

//Imprime los caracteres del 0 al 6 del texto "hola mundo", es decir, "hola m", cada uno en una linea.

        String texto = "hla mundo";
        String parte = texto.substring(0,6);

        for (int i=0; i< parte.length(); i++){
            System.out.println(parte.charAt(i));

        }
    }
}