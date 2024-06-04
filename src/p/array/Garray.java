package p.array;

import java.util.Arrays;
import java.util.Scanner;

public class Garray {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int g=0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("greatest no . is"+ arr[arr.length-1]);
    }
}
