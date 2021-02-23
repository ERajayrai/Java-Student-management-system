import java.sql.DriverManager;
import java.util.Scanner;

import com.mysql.jdbc.Connection;

public class employee {
	public static void main(String[] arg) 
	{
		Connection con;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
             con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root"); 
            Scanner obj1=new Scanner(System.in);
            System.out.println("1.for employee");
            Scanner obj2=new Scanner(System.in);
            System.out.println("2.for all list employee");
            Scanner obj4=new Scanner(System.in);
            System.out.println("3.enter for delet employee");
            Scanner obj5=new Scanner(System.in);
            System.out.println("4.enter for search employee");
            Scanner obj6=new Scanner(System.in);
            System.out.println("5.enter for exit employee");
            Scanner op=new Scanner(System.in);
            System.out.println("enter your opction");
            int opction=op.nextInt();
            
			switch(opction)
            {
				case 1:
					add();
					break;
				case 2:
					list();
					break;
				case 3:
					delet();
					break;
				case 4:
					search();
					break;
				case 5:
					exit();
					break;
            
                default:
                	System.out.println("you enter wrong key");
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
           System.out.println("enter the name");
            String name=ob.nextLine();
           Scanner oc=new Scanner(System.in);
            System.out.println("enter the Department");
           String Department=oc.nextLine();
            Scanner od=new Scanner(System.in);
            System.out.println("enter the salery");
            int salery=ob.nextInt();
            String sql="insert into employee values('"+name+"' ,'"+Department+"',"+salery+");"; 
            Mysqlemployee.updateDetails(sql);
  }
  
  static void list()
  {
	  String sql="select* from Employee;";
	 Mysqlemployee.printDetails(sql);
  }
  
  static void delet()
  {

            Scanner od=new Scanner(System.in);
            System.out.println("enter the salery");
            int salery=od.nextInt();
            String sql="delete from student where salery="+salery+";";
            Mysqlemployee.updateDetails(sql); 
  }
  static void search()
  {
	  Scanner od=new Scanner(System.in);
      System.out.println("enter the neme");
      String name=od.nextLine();
      String sql="select* from employee where name='"+name+"';";
      Mysqlemployee.printDetails(sql);
  }
  static void exit()
  {
	 System.out.println("you are exiting");
  }
  
  

}
			
				
		
