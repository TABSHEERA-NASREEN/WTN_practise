
public class Student extends Exception {

	public static String names[]= {"raju","ravi","hari","krish","arjun"};
	public static int marks[]= {62,98,99,13,108};
	Student(String str)
	{
		super(str);
	}
	public static void main(String[] args)
	{
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(names[i]+" "+marks[i]);
				if(marks[i]>100||marks[i]<0)
				{
					Student e=new Student("unreasonable marks of "+names[i]);
					throw e;
				}
			}
		}
		catch (Student e)
		{
			System.out.println(e);
		}
	}
}
