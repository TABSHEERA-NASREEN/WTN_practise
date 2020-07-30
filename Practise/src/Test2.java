import java.lang.*;
import java.io.*;
class Test2{
public static void main(String[] args) throws Exception
{
char ch;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any character");
ch=br.read();

if(Character.isDigit(ch))
	System.out.println("is a digit");
else if(Character.isUpperCase(ch))
	System.out.println("in upper case");
else if(Character.isLowerCase(ch))
	System.out.println("in lower case");
else if(Character.isWhitespace(ch))
	System.out.println("white space ");
else 
	System.out.println("i cant identify");
}
}