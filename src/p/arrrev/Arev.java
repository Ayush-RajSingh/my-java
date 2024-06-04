package p.arrrev;

import java.util.Arrays;
import java.util.Scanner;

public class Arev {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Array in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

