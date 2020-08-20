

import java.sql.*;

public class Resultsetmd {
    public static void main(String args[]) throws Exception 
    {
       try {
	      
	        Driver dre=new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(dre);
	        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
	        PreparedStatement ps=con.prepareStatement("select * from student");
	        ResultSet rs=ps.executeQuery();
	        ResultSetMetaData rsmd=rs.getMetaData();
	        System.out.println("columns "+rsmd.getColumnCount());
	        System.out.println("First column name :"+rsmd.getColumnName(1));
	        System.out.println("second column name :"+ rsmd.getColumnName(2));
	        System.out.println("Third column name :"+rsmd.getColumnName(3));
	        System.out.println("first column name type :"+rsmd.getColumnTypeName(1));
	        System.out.println("second column name type :" + rsmd.getColumnTypeName(2));
	        System.out.println("Third column name type :"+rsmd.getColumnTypeName(3));
	        
	    con.close();
	   } 
       catch (SQLException e) {
	// TODO Auto-generated catch block
	        e.printStackTrace();
          }
      }
}
 