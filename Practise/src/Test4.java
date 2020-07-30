import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ans=sc.nextLine();
		String low="abcdefghiklmnopqrstuvwxyz";
		//System.out.println(low.indexOf('c'));
		int len=ans.length();
		String res="";
		for(int i=0;i<len-1;i=i+1)
		{
			if(Character.isLetter(ans.charAt(i))&&Character.isLetter(ans.charAt(i+1)))
			{
				int h=low.indexOf(ans.charAt(i));
				int y=low.indexOf(ans.charAt(i+1));
				int q=h+y+2;
				if(q>25)
					q=q%25;
				char r=low.charAt(q-1);
				res=res+ans.charAt(i)+r;//ans.charAt(i+1);
				//i=i+1;
				
			}
			else 
			{
				res=res+ans.charAt(i)+ans.charAt(i+1);
				i=i+1;
			}
		}
		res=res+ans.charAt(len-1);
		System.out.println(res);
	}

}
