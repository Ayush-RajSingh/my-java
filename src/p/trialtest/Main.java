package p.trialtest;

public class Main {
    public static void main(String[] args) {
        try
        {
             T1 objone = new T1();
            T2 objtwo = new T2();
            Thread f = new Thread(objone );
            Thread s = new Thread(objtwo );
            f.start();
            s.start();
            f.join();
            s.join();
            System.out.println("Main thread Exit");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}

