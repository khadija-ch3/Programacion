import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int [] nums = new int[q-p+1];
        for (int i =0; i< nums.length;i++) {
            nums[i] = i + p;
        }
        for (int i=0; i< nums.length;i++){
            System.out.println(nums[i]);
        }

    }
}