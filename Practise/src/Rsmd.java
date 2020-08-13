

import java.sql.*;

public class Rsmd {
    public static void main(String args[]) throws Exception 
    {
       try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
	        PreparedStatement ps=con.prepareStatement("select * from student");
	        ResultSet rs=ps.executeQuery();
	        ResultSetMetaData rsmd=rs.getMetaData();
	        System.out.println("total no.columns "+rsmd.getColumnCount());
	        System.out.println("First col name :"+rsmd.getColumnName(1));
	        System.out.println("second col name :"+ rsmd.getColumnName(2));
	        System.out.println("Third col name :"+rsmd.getColumnName(3));
	        System.out.println("first col name type :"+rsmd.getColumnTypeName(1));
	        System.out.println("second col name type :" + rsmd.getColumnTypeName(2));
	        System.out.println("Third col name type :"+rsmd.getColumnTypeName(3));
	        System.out.println("get table name :"+rsmd.getTableName(1));
	    con.close();
	   } 
       catch (SQLException e) {
	// TODO Auto-generated catch block
	        e.printStackTrace();
          }
      }
}
 



//<https://teams.microsoft.com/l/message/19:9df55e46e90d4960b08856ffc1ff3d27@thread.tacv2/1597307662708?tenantId=808cc83e-a546-47e7-a03f-73a1ebba24f3&amp;groupId=3891ca1b-8a22-4375-84a5-f1bf56dfb8d7&amp;parentMessageId=1595043238454&amp;teamName=WTN Batch-5&amp;channelName=General&amp;createdTime=1597307662708>