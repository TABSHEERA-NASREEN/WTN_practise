import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter n");
		int n=sc.nextInt();
		int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(k+" ");
				k=k+2;
			}
			k=k-(n/2)*2-2;;
			System.out.println();
		}
		sc.close();
	}

}
