package p.firstletter;

import java.util.Scanner;

public class Firstl {
    public static void main(String[] args) {
        String sarr[] = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter names");
        for (int i = 0; i < sarr.length; i++) {
            sarr[i] = scanner.next();
        }
        char ch = sarr[0].charAt(0);
        for (int i = 0; i < sarr.length; i++) {
                if (ch!=sarr[i].charAt(0))
                {
                    System.out.println("f");
                    return;
                }
                else
                {
                    System.out.println("t");
                }
            }
        }
    }

