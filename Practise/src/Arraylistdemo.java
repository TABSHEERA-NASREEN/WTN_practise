import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("nazi");
		ar.add("niha");
		ar.add("sailu");
		ar.add("nihanth");
		System.out.println(ar);
		ar.remove("nihanth");
		System.out.println(ar);
		ListIterator i=ar.listIterator();

		while(i.hasNext())
		{
			String s=(String) i.next();
		System.out.println(s);
		} 
		while(i.hasPrevious())
		{
			String p=(String) i.previous();
			System.out.println(p);
		}
	}

}
