public class Main {
    public static void main(String[] args) {
        String texto = "defrgthyjukil";

        String reves = " ";
        for (int i = texto.length()-1; i >=0; i--) {
            reves += texto.charAt(i);
        }

    }
}