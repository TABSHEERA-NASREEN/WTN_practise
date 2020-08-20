import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

 

public class CallabelProcedure {

 

    public static void main(String[] args) {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            
            // create callable statemnt obj
            CallableStatement cst=con.prepareCall("{ CALL second(?,?)}");
            
            // register out parameters with jdbc types
            cst.registerOutParameter(2, Types.INTEGER);
            
            //set values to IN parameters
            cst.setInt(1, 20);
            
            // call pl/sql procedure
            cst.execute();
            
            // gather result from out paramters
            int res=cst.getInt(2);
            System.out.println(" result is :"+ res);
            
            //close 
            con.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }

 

    }

 

}