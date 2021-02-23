import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class MyOprections {
	
	 public static void main(String [] arg)
	    {
	        try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ajayrai","root","root"); 
	            Scanner obj1=new Scanner(System.in);
	            System.out.println("1.for add student");
	            Scanner obj2=new Scanner(System.in);
	            System.out.println("2.for delet");
	            Scanner obj4=new Scanner(System.in);
	            System.out.println("4.enter for search");
	            Scanner obj5=new Scanner(System.in);
	            System.out.println("5.enter for list all");
	            Scanner obj6=new Scanner(System.in);
	            System.out.println("6.enter for exit");
	            Scanner op=new Scanner(System.in);
	            System.out.println("enter your opction");
	            int opction=op.nextInt();
	            
				switch(opction)
	            {
					case 1:
						add();
						break;
					case 5:
						list();
						break;
					case 2:
						delet();
						break;
					case 3:
						search();
						break;
	            
	                default:
	                    break;
	            }
	        }
	        catch(Exception e)
	        {
	        	 e.printStackTrace();
	        }       
	        	
	    
	 	    }
	 
	 static void add()
      {
      	  Scanner ob=new Scanner(System.in);
	           System.out.println("enter the studentname");
	            String name=ob.nextLine();
	           Scanner oc=new Scanner(System.in);
	            System.out.println("enter the branch");
	           String branch=oc.nextLine();
	            Scanner od=new Scanner(System.in);
	            System.out.println("enter the roll number");
	            int rollnumber=ob.nextInt();
	            String sql="insert into student values("+rollnumber+""+name+"','"+branch+"');";  
	            MySqlOprection.updateDetails(sql);
      }
	  
	  static void list()
	  {
		  String sql="select* from student;";
		 MySqlOprection.printDetails(sql);
	  }
	  
	  static void delet()
	  {

	            Scanner od=new Scanner(System.in);
	            System.out.println("enter the roll number");
	            int rollnumber=od.nextInt();
	            String sql="delete from student where rolnumber="+rollnumber+";";
	            MySqlOprection.updateDetails(sql); 
	  }
	  static void search()
	  {
		  Scanner od=new Scanner(System.in);
          System.out.println("enter the neme");
          String name=od.nextLine();
          String sql="select* from student where studantname='"+name+"';";
 		 MySqlOprection.printDetails(sql);
	  }
	  
	  

}
