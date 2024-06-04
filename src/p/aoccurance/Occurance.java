package p.aoccurance;
import java.util.Arrays;
import java.util.Scanner;

public class Occurance {
    public static int getOccurance(int[]arr,int num)
    { int j=0;
        for (int i = 0; i <arr.length; i++) {
            if( arr[i]==num) {
                j++;
            }
        }
        return j;

    }
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        int n;
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
            System.out.println("enter any num");
            n= scanner.nextInt();
            int j=getOccurance(arr,n);
            System.out.println(n+"occured"+j+"times");

        }
    }
