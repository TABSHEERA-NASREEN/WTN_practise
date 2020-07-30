import java.util.Scanner;

public class Matrixpowers {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of matrix");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int c[][]=new int[n][n];

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
				b[i][j]=a[i][j];
			}
			
		}
		System.out.println("enter power size");
		int p=sc.nextInt();
		 for(int l=0;l<p-1;l++)
		    {
			  int sum=0;
			    for(int i=0;i<n;i++)
			    {
			       for(int j=0;j<n;j++)
			       {
			           for(int k=0;k<n;k++)
			                sum+=a[i][k]*b[k][j];
			           c[i][j]=sum;
			           sum=0;
			       }
			    }
			    
		        
		        for(int i=0;i<n;i++) {
		            for(int j=0;j<n;j++) {
		               b[i][j]=c[i][j]; } }
		    }
		 
		 for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
				
			}
		    }
		
		
	}

