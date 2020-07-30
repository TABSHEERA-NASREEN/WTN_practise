import java.util.Scanner;

public class Pincreation {

	public static int getpin(int input1,int input2,int input3)
	{
		int u1=input1%10;
		int u2=input2%10;
		int u3=input3%10;
		int t1=u1%10;
		int t2=u2%10;
		int t3=u3%10;
		int h1=input1/100;
		int h2=input2/100;
		int h3=input3/100;
		int u=Math.min(u3, Math.min(u1,u2));
		int t=Math.min(t3,Math.min(t1,t2));
		int h=Math.min(h3,Math.min(h1,h2));
		int max1=Math.max(u1,Math.max(u2,u3));
		int max2=Math.max(t1,Math.max(t2, t3));
		int max3=Math.max(h1,Math.max(h2,h3));
		int max=Math.max(max1, Math.max(max2, max3));
		int nbr=max*1000+h*100+t*10+u;
		return nbr;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		int ansr=getpin(input1,input2,input3);
		System.out.println(ansr);
	}

}
