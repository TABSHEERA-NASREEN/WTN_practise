import java.util.Scanner;

public class LCMEx {

	public int lcmfun(int a,int b)
	{
		int ans;
		if(a>b)
	    {
	    	ans=a;
	    	
	    }
	    else 
	    {
	    	ans=b;
	    }
		 while(true)
	        {
	            if( ans % a == 0 && ans % b == 0 )
	            {
	                //System.out.printf("The LCM is:"+ans);
	            	return ans;
	            }
	           ans++;
	       }	
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LCMEx obj=new LCMEx();
		System.out.println("Enter the number of numbers");
		int n1=sc.nextInt();
		int a[]=new int[n1];
	   System.out.println("Enter the numbers");
	   for(int i=0;i<n1;i++)
	   {
		   a[i]=sc.nextInt();
	   }
	   int l=1;
	   for(int i=0;i<n1;i++)
	   {
	     l=obj.lcmfun(l,a[i]);
	   }
	   System.out.println("lcm is "+l);
        sc.close();
	}

}
