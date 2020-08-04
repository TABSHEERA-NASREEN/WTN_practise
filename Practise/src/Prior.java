class Demo extends Thread
{
	int count=0;
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			count++;
			System.out.println("Current thread "+Thread.currentThread().getName());
			System.out.println("Its priority "+Thread.currentThread().getPriority());
			
		}
	}
}
public class Prior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj=new Demo();
		Thread t1=new Thread(obj,"one");
		Thread t2=new Thread(obj,"second");
		int p=4;
		t1.setPriority(p);
		int q=3;
		t2.setPriority(q);
		t1.start();
		t2.start();

	}

}
