public class Main {
    public static void main(String[] args) {

        int[][] matriz = {
                {11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}
        };

        int pos = 0;
        int max = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    pos++ ;
                }
            }
        }
        System.out.println("Valor máximo: " + max + " su posición sera : " + pos );
    }
}