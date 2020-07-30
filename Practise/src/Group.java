
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Group {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				Employee arr[]=new Employee[5];
				for(int i=0;i<5;i++)
				{
					System.out.println("Enter id ");
				int id=Integer.parseInt(br.readLine());
				System.out.println("Name: ");
				String name=br.readLine();
				arr[i]=new Employee(id,name);
				}
				for(int i=0 ;i<5;i++)
				{
				arr[i].Display();
				}
		
	}

}
