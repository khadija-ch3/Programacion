public class Main {
    public static void main(String[] args) {

       String tex = "Soy productivo programando en Prolog";

       String pre= "pro";
       String[] partes = tex.split(" "); // {"SOY", "PROUCTOVTIVO", "....

        for (int i = 0; i < partes.length; i++) {
            if (partes[i].toLowerCase().startsWith(pre)){
                System.out.println(partes[i]);
            }

        }
       //partir el texto en palabras con split
        // hacer un for de las palabras
        //si la palabra pasa a minusculas es igual al prefijo
        //imprimir palabra


    }
}