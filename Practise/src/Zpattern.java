import java.util.Scanner;

public class Zpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

	      System.out.print("Enter a number: ");
	      int n = input.nextInt(); 
	      int k=1;
	      for (int x = 1; x <= n; x++) {
	         for (int y =1; y<=n; y++) {
	            if (x==1||x+y==n+1||x==n) {
	               System.out.print(k+" ");
	               k++;
	            }
	            else
	               System.out.print("  ");
	         } 
	         System.out.println(); 
	      }      
	}

}
