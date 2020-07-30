import java.util.Scanner;
import java.util.StringTokenizer;

public class Stringex1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		StringTokenizer tokens1 = new StringTokenizer(input1," ");
		StringTokenizer tokens2 = new StringTokenizer(input2," ");
		int n1=tokens1.countTokens();
		char[] alphabets = new char[n1];
		int n2=tokens2.countTokens();
		int[] numbers = new int[n2];
		int i=0;
		while(tokens1.hasMoreTokens()){
		    alphabets[i]=tokens1.nextToken().charAt(0);
		    i++;
		}
		i=0;
		while(tokens2.hasMoreTokens()){
		    numbers[i]=Integer.parseInt(tokens2.nextToken());
		    numbers[i]%=26;
		    i++;
		}
		for(int j=0;j<n2;j++){
		    if(j%2==1)  numbers[j]*=-1;
		    for(int k=0;k<n1;k++){
		        int current = alphabets[k]-'a'+1;
		        int next = current+numbers[j];
		        if(next<0)  next+=26;
		        else if(next>26) next%=26;
		        if(next==0) next=26;
		        System.out.println((char)('a'+current-1)+"="+(char)('a'+next-1));
		    }
		    System.out.println();
		}
		
	}
}