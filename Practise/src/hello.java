import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

class hello
{

public static void main(String args[])

{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int a[]=new int[n];

PriorityQueue<Integer> queue =new PriorityQueue<Integer>();
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
	queue.add(a[i]);
}
Arrays.sort(a);
int sum=0;
while(k>0)
{
  
    int t=0;
    t=queue.peek();
    queue.remove();
    t=t/2;
    queue.add(t);
    k--;
}
Iterator<Integer> itr=queue.iterator(); 
while(itr.hasNext())
{  
sum=sum+itr.next();  
}  
System.out.println(sum);
}

}
