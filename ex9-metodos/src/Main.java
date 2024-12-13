import java.util.Locale;

public class Main {
    public static void main(String[] args) {

    String texto = "juAn gOMez perEZ";

    String minus = texto.toLowerCase();

    String [] minuscPartes = minus.split(" ");

    //String [] mins = {"juan", "gomez","perez"};
        for (int i = 0; i <minuscPartes.length; i++) {
            String letra1 = minuscPartes[i].substring(0,1); // la letra del posicion 0 es que substring no llega al otra siempre llega a este numero-1
            String resto = minuscPartes[i].substring(1); // si pongo solo 1 se significa de 1 hasta el final ya

            System.out.println(letra1.toUpperCase() + resto);

        }




    }
}