package p.trialtest;

public class T1  implements Runnable  {
    public void run() {
        try
        {
            while (true) {
                System.out.println("hello");
                Thread.sleep(2000);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
