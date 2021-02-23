
import java.sql.*;
import java.util.Scanner;
public class Database {


    public static void main(String[] arg)
    {
         //con;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajayrai","root","root");
            Statement stmt=con.createStatement();
            Scanner obj1=new Scanner(System.in);
            System.out.println("ienter the studentname");
            String name=obj1.nextLine();
            Scanner obj2=new Scanner(System.in);
            System.out.println("enter the branch");
            String branch=obj2.nextLine();
            Scanner obj3=new Scanner(System.in);
            System.out.println("enter the roll number");
            int rollnumber=obj3.nextInt();
            String sql = null;
			stmt.executeUpdate(sql);
            ResultSet rs=stmt.executeQuery("select * from student");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3));
            
            }    

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }

}
