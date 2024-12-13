public class Main {
    public static void main(String[] args) {

        String texto = "aaa@b.ccc";
        int posicionArroba = texto.indexOf('@');
        int posicionPunto = texto.indexOf('.');

        if (posicionArroba > 0 && posicionPunto > posicionArroba + 1 && posicionArroba < texto.length() - 1) {
            System.out.println(" se parece un email");
        }

    }
}