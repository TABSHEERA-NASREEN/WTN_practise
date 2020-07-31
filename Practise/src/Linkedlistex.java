import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * class LinkedList<T>
 * 
 * LinkedList<String> l1=new LinkedList<String>();
 *
 *Methods:
 *
 *1. boolean add(element obj)
 *2. void add(int pos,element obj)
 *3. void addFirst(element obj)
 *4. void addLast(element obj)
 *5. element removeFirst()
 *6. element removeLast()
 *7. element remove(int pos)
 *8. void clear()
 *9. element get(int index)
 *10. element getFirst()
 *11. element getLast()
 *12. element set(int index, ele obj)
 *13.int size()
 *14. int indexOf(obj o)-returns first index of o in list
 *15.int lastindexOf(obj 0)-returns last index of o in list
 *16. object[] toArray();
*/
public class Linkedlistex {
	public static void main(String[] args) throws IOException {
	LinkedList<String> l1=new LinkedList<String>();
	Scanner sc=new Scanner(System.in);
	l1.add("nazi");
	l1.add("hari");
	l1.add("sana");
	System.out.println("list is "+l1);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int f=0;
	while(f==0)
	{
		System.out.println("LinkedList Menu");
		System.out.println("1. Add element");
		System.out.println("2. REmove Element");
		System.out.println("3. Change element");
		System.out.println("4.Display list");
		System.out.println("5. exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("element addition");
		System.out.println("enter the element");
		String s=br.readLine();
		System.out.println("enter position");
		int pos=Integer.parseInt(br.readLine());
		l1.add(pos-1,s);
		break;
		case 2:System.out.println("REmoving element");
		System.out.println("enter the position ");
		int pos2=Integer.parseInt(br.readLine());
		l1.remove(pos2-1);
		break;
		case 3:System.out.println("Enter the position");
		int pos1=Integer.parseInt(br.readLine());
		System.out.println("Enter new element");
		String s1=br.readLine();
		l1.set(pos1-1,s1);
		break;
		case 4:System.out.println("list is "+l1);
		break;
		case 5:f=1;
		break;
		default: System.out.println("wrong choice");
		break;
		}
		
	}
	System.out.println("Final list is");
	Iterator it=l1.listIterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
}
}