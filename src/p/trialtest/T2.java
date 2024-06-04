package p.trialtest;

import java.util.Scanner;

public class T2 implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("enter any char ");
                Scanner sc = new Scanner(System.in);
                char c = sc.next().charAt(0);
                System.out.println("You have entered " + c);
                if (c == 'a' && c == 'A') {
                    System.out.println("t2 terminated ");
                }
                Thread.sleep(1000);
            }
            }
        catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }


