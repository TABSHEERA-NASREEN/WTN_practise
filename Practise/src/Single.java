

    class MyThread implements Runnable
{
    public void run()
    {
        try {
            issueTicket();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            verifyTicket();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            showSeat();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
   
    void issueTicket() throws InterruptedException
    {
            System.out.println("issue ticket");
            Thread.sleep(1000);
    }
    void verifyTicket() throws InterruptedException
    {
        System.out.println("verify ticket");
        Thread.sleep(1000);
    }
    void showSeat() throws InterruptedException
    {
        System.out.println("shows the seat");
        Thread.sleep(1000);
    }
}
public class Single {
public static void main(String args[])
{
        MyThread obj=new MyThread();
        Thread t=new Thread(obj);
        t.start();
}
}
 
