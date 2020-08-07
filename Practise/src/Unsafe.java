
    
class Reserve extends Thread
{
    int available=1;
    int wanted;
    
    // accept wanted berths at run time
    Reserve(int i)
    {
        wanted=i;
    }
    public void run()
    {
        synchronized(this)
        {
            
        System.out.println("available berths"+available);
        //if avail berths are more than wanted
        if(available>=wanted)
        {
                //get the name of the passenger
                String name=Thread.currentThread().getName();
                System.out.println(wanted+" berthe alloted to "+ name);
                try {
                    Thread.sleep(1000);
                    available=available-wanted;
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                // if available berths are less display sorry
                
        }
        else 
            System.out.println("sorry no berths");
    }
    
    }
}
public class Unsafe {
    public static void main(String args[])
    {
            Reserve obj=new Reserve(1);
            // attach first thread to the obj
            Thread t1=new Thread(obj);
            Thread t2=new Thread(obj);
            
            
            t1.setName("First person");
            t2.setName("Second Person");
            
            t1.start();
            t2.start();
            
            
            
    }


}
 

