import java.util.ArrayList;
import java.util.Scanner;

public class Araylistex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			int k=sc.nextInt();
			a.add(k);
		}
		int h=sc.nextInt();
		int index=sc.nextInt();
		a.add(index,h);
		for(int i=index+1;i<n;i++)
		{
			if(a.get(i)==h)
			{
				a.remove(i);
			}
		}
		System.out.print(a);
	}

}
