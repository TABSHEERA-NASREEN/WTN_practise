
public class WeightHillPattern {

	public static int weight(int input1,int input2,int input3)
	{
		int weight=0,k;
		for(int i=0;i<input1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				weight+=input2;
			}
			input2+=input3;
		}
		return weight;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answr=weight(3,2,10);
		System.out.println(answr);
	}

}
