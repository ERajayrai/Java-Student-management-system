import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mysqlemployee {
	
	public static void printDetails(String sql)
	{
		Connection con;
		try
		{

			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			
			Statement stmt=con.createStatement();
			 
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{(1)+"   "+rs.getString(2)+"  "+rs.getInt(3));
             System.out.println(rs.getString
			}
			con.close();	
		}	
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }
	        
			
			
			
				
			
    }

    public static int updateDetails(String sql)
    {
    	int rs=0;
    	try
    	{
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			Statement stmt=con.createStatement();
			rs=stmt.executeUpdate(sql);
		
            
    	}
    	catch(Exception e)
        {
            e.printStackTrace();
        }
		
		return rs;
        
    }
    
    

}
