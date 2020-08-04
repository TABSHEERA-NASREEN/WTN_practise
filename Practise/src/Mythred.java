public class Mythred implements Runnable
{
	public void run()
	{
		a();
		b();
		c();
	}
	public void a()
	{
		System.out.println("a ");
	}
	public void b()
	{
		System.out.println("b ");
	}
	public void c()
	{
		System.out.println("c ");
	}
}