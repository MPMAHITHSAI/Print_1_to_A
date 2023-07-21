package Upto_N_numbers;

import java.util.Scanner;

public class Print12A {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        print(1,A);
    }

    private static void print(int i, int A) {
        if(i>A){
            return;
        }
        System.out.print(i+"  ");
        print(i+1,A);
       
    }
}