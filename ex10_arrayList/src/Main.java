import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
        //Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego mostrará la altura media, máxima y mínima así como cuántas personas miden por
        // encima y por debajo de la media.
        Scanner scanner= new Scanner(System.in);
        int numeroPersonas = scanner.nextInt();
        float [] altura = new float[numeroPersonas];
        for (int i= 0;i <altura.length; i++){
            altura[i] = scanner.nextFloat();
        }
        float suma =0;
        for (int i =0;i<altura.length;i++){
           suma+= altura[i];
        }
        float media = suma/ numeroPersonas;
        System.out.println("la media es :" + media);

        float Max = Float.MIN_VALUE;
        for (int i =0;i<altura.length;i++){
            if (Max > altura[i]){
                Max = altura[i];
            }

        }

        System.out.println(Max);


        float Min = Float.MAX_VALUE;
        for (int i =0;i<altura.length;i++){
            if (Min < altura[i]){
                Min= altura[i];
            }

        }
        System.out.println(Min);
        int debajo =0;
        int alto =0;
        boolean hayalguno = false;
        for (int i =0;i<altura.length;i++){
            if (altura[i] < media){
                debajo++;
            }else if ( altura[i] > media){
                alto++;
            }else {
                hayalguno= true;
            }

        }
        System.out.println("bajo" + " " + alto);
        System.out.println((hayalguno));
    }
}