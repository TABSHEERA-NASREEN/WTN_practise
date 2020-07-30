import java.util.Scanner;


public class Matrixmul
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,m;
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		int a[][] = new int[n][m];
		
		for(int i=0;i<n;i++)
		{
			String s[] = sc.nextLine().split(" ");
			for(int j=0;j<m;j++)
			{
				a[i][j] = Integer.parseInt(s[j]); 
			}
		}
		int b[][] = new int[m][n];
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        b[i][j]=a[j][i];
		    }
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){    
		        int h=0;      
		        for(int k=0;k<m;k++){
		            h+=a[i][k]*b[k][j];      
		        }
		        System.out.print(h+" ");
            }
            System.out.println();
		}
	}
}
