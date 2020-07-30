

class Myexception extends Exception
{
    //store accno.


    private static int accno[]={1001,1002,1003,1004,1005};
    // store accn names
    private static String name[]={"aaa","bbb","ccc","ddd","eee"};
    // acc balance
    private static double bal[]={10000.00,12000.00,5600.05,999,1100};


   /* Myexception()
    {
    } */
    Myexception(String str)
    {
        super(str);
    }


    public static void main(String[] args)
    {
        try{
        //display
        System.out.println("ACCNO" + "\t" + "NAME" + "\t" + "BAL");
        
        for(int i=0;i<5;i++)
        {
            System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
            
            if(bal[i]<1000)
            {
                Myexception me=new Myexception("balance amount is less");
                throw me;
            }
        }
    }
         catch (Myexception me)
        {
            System.out.println(me);
        }
}
}


