package p.calc;

import java.util.Scanner;

public class Calculator {
    private int n1;
    private int n2;

    public void set(int a, int b) {
        n1=a;
        n2=b;
    }
    public int add() {
        int a;
        a= n1 + n2;
        return a;
    }

    public int subtract()
    {
        int s;
        s= n1 - n2;
        return s;
    }
}
