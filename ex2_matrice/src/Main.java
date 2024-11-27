import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        char[][] matrice = {
                {'a','h','f','h'},
                {'l','y','w','p','q','y'},
                {'c','z','p','r','t'},
                {'f','g','e','q','x','r','t','y'}
        };
int c =0;
        for (int i=0;i<matrice.length; i++){
            for (int j=0 ;j<matrice[i].length;j++){
                c++;
            }
        }

                System.out.println(c + " " ) ;
            }
        }
