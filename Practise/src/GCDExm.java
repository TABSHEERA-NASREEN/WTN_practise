import java.util.Scanner;

public class GCDExm {
	public int gcdfun(int a,int b)
	{
		//int gcd=1;
		 while (a != b) {
	        	if(a > b)
	                a = a - b;
	            else
	               b= b -a;
	        }

		 //System.out.println(gcd);
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	/*	int a=sc.nextInt();
		int b=sc.nextInt(); */
		/*int gcd=1;
		 for(int i = 1; i <=a && i<=b; i++)
	        {
	            if(a%i==0 && b%i==0)
	                gcd = i;
	        }
		 System.out.println(gcd);*/
		GCDExm obj=new GCDExm();
		System.out.println("Enter the number of numbers");
		int n1=sc.nextInt();
		int a[]=new int[n1];
	   System.out.println("Enter the numbers");
	   for(int i=0;i<n1;i++)
	   {
		   a[i]=sc.nextInt();
	   }
	   int l=a[0];
	   for(int i=1;i<n1;i++)
	   {
	     l=obj.gcdfun(l,a[i]);
	   }
	   System.out.println("GCD is "+l);
        sc.close();
	}

}
