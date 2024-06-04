package p.array2d;

import java.util.Arrays;
import java.util.Scanner;

public class Gr8 {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        int g = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] > g) {
                    g = arr[i][j];
                }
            }
        }
        System.out.println("greatest no is " + g);
    }
}
