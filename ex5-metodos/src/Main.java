public class Main {
    public static void main(String[] args) {
        String texto = "hola mundo";
        String textoMinusculas = texto.toLowerCase();

        //  String textoMinusculas = "hola mundo".toLowerCase(); =======> podemos escribir la expresion e arriba con esta forma tembién



        System.out.println(textoMinusculas.contains("mundo")); // aprobamos si el texto en minisculas contiene la palabra mundo

    }
}