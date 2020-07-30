public class Run
{
	public static void main(String[] args) {
	    try{
	        if(args.length!=2)   
	        	throw new RuntimeException("Must give exactly two numbers");
	        System.out.println("Given two numbers are: "+args[0]+" "+args[1]);
	    }
	    catch(RuntimeException re){
	        System.out.println(re);
	    }
	}
}
