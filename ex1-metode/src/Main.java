public class Main {
    public static void main(String[] args) {

       String texto = "hola mundo";
// una manera de solucion
       for (int i= 0; i< texto.length(); i++){
           System.out.print(texto.charAt(i));
       }
       // otra manera con metodos

        String parte = texto.substring(0,7);
        for (int i= 0; i< parte.length(); i++){
            System.out.println(parte.charAt(i));
        }

    }
}