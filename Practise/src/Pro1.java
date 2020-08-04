import java.util.LinkedList;

public class Pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,4,3,2,1};
		int l=a.length;
		LinkedList<Integer> l1=new LinkedList<Integer>();
		for(int i=0;i<l;i++)
		{
			l1.add(a[i]);
		}
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(l1.get(i)<l1.get(j))
				{
					int temp=l1.get(i);
					l1.remove(i);
					l1.add(j,temp);
					break;
				}
			}
			System.out.println(l1);
		}
		
		
	}

}
