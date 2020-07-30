import java.util.ArrayList;
import java.util.Scanner;

public class Booklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int id;
	     String name;
	     String author;
	     String publisher;
	     int quantity;
	     Scanner sc=new Scanner(System.in);
	     ArrayList<Book> ar=new ArrayList<Book>();
	     for(int i=0;i<5;i++)
	        {
	            System.out.println("enter id");
	            id=sc.nextInt();
	            sc.nextLine();
	            System.out.println("enter name");
	            name=sc.nextLine();
	            System.out.println("enter author");
	            author=sc.nextLine();
	            System.out.println("enter publisher");
	            publisher=sc.nextLine();
	            System.out.println("enter quantity");
	            quantity=sc.nextInt();
	    
	            
	            Book obj=new Book(id,name,author,publisher,quantity);
	           
	            ar.add(obj);
	        }

	     System.out.println("enter id for seaching");
	     int h=sc.nextInt();
	     boolean found=false;
	     for(int i=0;i<ar.size();i++)
	     {    
	         Book obj=ar.get(i);
	         if(obj.id==h)
	         {
	        	 obj.display();
	        	 found=true;
	         }
	         if(!found)
	         {
	        	 System.out.println("Not found");
	         }
	   	}
	     if(!found)
         {
        	 System.out.println("Not found");
         }
     
	}

}
