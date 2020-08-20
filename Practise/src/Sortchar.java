import java.util.Arrays;
import java.util.Scanner;

public class Sortchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ar=s.toCharArray();
		Arrays.sort(ar);
		System.out.println(ar);
		sc.close();
	}

}
