import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		HashMap<String,Long> hs=new HashMap<String,Long>();
		String name,str;
		Long phn;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("1. Enter phn entries");
			System.out.println("2. Look up in book");
			System.out.println("3. Display name in book");
			System.out.println("4. exit");
			System.out.println("Enter your choice");
			int n=Integer.parseInt(br.readLine());
			switch(n)
			{
			case 1: System.out.println("enter name");
					name=br.readLine();
					System.out.println("enter phn number");
					str=br.readLine();
					phn=new Long(str);
			
					hs.put(name, phn);
					break;
			
			case 2: System.out.println("enter name");
				    name=br.readLine();
				    System.out.println("The phone numbr is"+hs.get(name));
				    break;
			case 3: System.out.println(hs);
					break;
			case 4: 
					break;
		}
		
	}
	}
}

