import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap tm=new TreeMap();
		tm.put(100,'a');
		tm.put(200,'b');
		tm.put(150,'c');
		tm.put(676,'g');
		tm.put(6,'a');
		tm.put(54,'t');
		System.out.println(tm);
		NavigableMap nm=tm.descendingMap();
		System.out.println(nm);
	}

}
