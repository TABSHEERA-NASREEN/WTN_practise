import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Employe
{
    int id;
    String name;
    String address;

public Employe(int id2, String name2, String address2) {
		// TODO Auto-generated constructor stub
		id=id2;
        name=name2;
        address=address2;
	}
void display()
    {
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("address="+address);
    }
}

 

class Emplist
{
    public static void main(String args[]) throws NumberFormatException, IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        

 

        int id;
        String name;
        String address;
        

 

        //create arraylist
        ArrayList<Employe> arl=new ArrayList<Employe>();
        
        //accept 5 emp records 

 

        for(int i=0;i<5;i++)
        {
            System.out.println("enter id");
            id=Integer.parseInt(br.readLine());
            
            System.out.println("enter name");
            name=br.readLine();
            
            System.out.println("enter address");
            address=br.readLine();
    
            //create emp obj with accepted data
            Employe obj=new Employe(id, name,address);

 

            //add to arraylist

 

            arl.add(obj);
        }

 

    // Now search for a employee

 

    System.out.println("enter id for seaching");
    id=Integer.parseInt(br.readLine());
    
    // found becomes true than employee id is found in arl;
    boolean found=false;

 

    //search
    for(int i=0;i<arl.size();i++)
    {    
        Employe obj=arl.get(i);

 

        // check if given id is equal to id of emp object

 

        if(id==obj.id)
        {
            obj.display();
            found=true;
        }
    }
    if(!found)
    System.out.println("enter employee not found");
    }
}