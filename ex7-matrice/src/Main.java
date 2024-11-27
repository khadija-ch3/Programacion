public class Main {
    public static void main(String[] args) {

        int[][] matriz = {
                {5, 12, 7},
                {4, 8, 15},
                {9, 3, 10}
        };


        int valorBuscado = 8;
        int c = 0;
        boolean encontrado = false;


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valorBuscado) {
                    encontrado = true;
                    c++;
                    System.out.println("Value found at: [" + i + "][" + j + "]" + " " + " repeted " + c );
                }
            }
        }
    }
}