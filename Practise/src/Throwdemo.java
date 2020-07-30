import java.lang.*;
class Sample
{
	static void demo()
    {
        System.out.println("inside demo");
        throw new NullPointerException("exception data");
        //NullPointerException ne=new NullPointerException("Exception data");
        //throw ne;
    }
    catch (NullPointerException ne)
    {
        System.out.println(ne);    
    }
}
public class Throwdemo {
public static void main(String[] args)
{
	Sample.demo();
}
}
