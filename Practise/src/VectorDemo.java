import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v=new Vector<Integer>();
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<10;i++)
		{
			v.add(a[i]);
		}
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		ListIterator i=v.listIterator();
		while(i.hasNext())
		{
		int s=(int)i.next();
		System.out.println(s);
		} 
		while(i.hasPrevious())
		{
			int p=(int) i.previous();
			System.out.println(p);
		}
	}
	

}
