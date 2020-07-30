import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HashTableDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Hashtable<String,Integer> hs=new Hashtable<String,Integer>();
		String name,str;
		int score;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			int f=1;
			System.out.println("1. Enter score for player");
			System.out.println("2. Check score of player");
			System.out.println("3. Display score of players");
			System.out.println("4. exit");
			System.out.println("Enter your choice");
			int n=Integer.parseInt(br.readLine());
			switch(n)
			{
			
			case 1: System.out.println("enter name of player");
			name=br.readLine();
			System.out.println("enter score");
			str=br.readLine();
			score=new Integer(str);
	
			hs.put(name,score);
			break;
	
			case 2: System.out.println("enter name");
					name=br.readLine();
					System.out.println("His score is"+hs.get(name));
					break;
			case 3: System.out.println(hs);
					break;
			case 4: f=0;
					break;
			}
			if(f==0)
			{
				break;
			}
		}
System.out.println("Thank You");
	}

}
