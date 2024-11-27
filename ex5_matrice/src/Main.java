public class Main {
    public static void main(String[] args) {

        int[][] matriz = {
                {3, 5, 1},
                {2, 4, 6},
                {8, 7, 9}
        };


        for (int i=0;i<matriz.length;i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {

                sumaFila += matriz[i][j];
            }
            System.out.println("Suma de la " +  i + " fila: " + sumaFila);
        }

    }
}