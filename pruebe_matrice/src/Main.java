import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int[][] nums = new int[5][3];

        for ( int i=0;i<nums.length ;i ++){
            for (int j=0;j <nums[i].length; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }
        for ( int i=0;i<5 ;i ++){
        for (int j=0;j <3; j++) {
            System.out.print( nums[i][j] +  " ");
        }
            System.out.println();
            }
        }
}