import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Functioncallable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            CallableStatement stmt=con.prepareCall("{?=call calu(?,?)}");
            stmt.setInt(2,53);
            stmt.setInt(3,32);
            stmt.registerOutParameter(1,Types.INTEGER);
            stmt.execute();
            System.out.println(stmt.getInt(1));
        }
		catch(Exception ep)
		{
			System.out.println(ep);
		}
	}

}
