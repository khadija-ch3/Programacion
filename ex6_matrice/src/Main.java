public class Main {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        int[] temp = matriz[0];
        matriz[0] = matriz[2];
        matriz[2] = temp;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print( matriz[i][j] + " " );
            }
            System.out.println();

        }
    }
}