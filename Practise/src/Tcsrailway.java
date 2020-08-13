import java.util.Arrays;
import java.util.Scanner;

public class Tcsrailway {
	static int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int ar[] =new int[size];
		int dep[]=new int[size];
		int diff[]=new int[size];
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
			dep[i]=sc.nextInt();
			diff[i]=ar[i]+dep[i];
		}
		int l=1;
		Arrays.sort(ar);
		Arrays.sort(diff);
		int platforms=1;
		int p=1,q=0;
		while(q<size && p<size)
		{
			if(ar[p]>diff[q])
			{
				platforms--;
				q++;
			}
			else
			{
				platforms++;
				p++;
			}
			l=max(platforms,l);
		}
		System.out.println(l);
		sc.close();
	}

}
