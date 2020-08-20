import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

 

public class DBbmetadata {
public static void main(String args[])
{
    try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
        DatabaseMetaData dbmd=con.getMetaData();
        
        System.out.println("driver name: "+dbmd.getDriverName());
        System.out.println("driver version: "+dbmd.getDriverVersion());
        System.out.println("user name: "+dbmd.getUserName());
        System.out.println("database product name: "+dbmd.getDatabaseProductName());
       
        System.out.println("databse product version: "+dbmd.getDatabaseProductVersion());
       
        con.close();
        
    }catch(Exception e)
    {
        System.out.println(e);
    }
}
}
 