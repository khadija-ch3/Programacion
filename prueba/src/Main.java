import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int [] tab1 = new int[n];
        for (int i=0;i <tab1.length;i++){
            tab1[i] = scanner.nextInt();
        }
        int [] tab2 = new int[n];
        for (int i=0;i <tab2.length;i++){
            tab2[i] = scanner.nextInt();
        }
        int c =0 ;
        for (int i=0;i <n;i++){
            if (tab1[i] == tab2[i]){
                c++;
            }
        }
        if (c == n){
            System.out.println("son iguales");
        }
        else{
            System.out.println("son diferentes");
        }

        }
    }