import java.util.Scanner;
import java.sql.*;
public class Pranay {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Library management system");
    int choice;
    while(true){
         System.out.println();
        System.out.println("Options");
        System.out.println("1.Enter a new employee");
        System.out.println("2.Delete an employee");
        System.out.println("3.Display all employee details");
        System.out.println("4.Exit");
        System.out.println();
        choice = Integer.parseInt(input.nextLine());
    switch(choice){
    case 1:
        int age, id,sum;
        String fname,lname;
        System.out.println("Enter First Name of employee:");
        fname=input.nextLine();
        System.out.println("Enter Last Name of employee:");
        lname=input.nextLine();
        System.out.println("Enter employee Age:");
        age = Integer.parseInt(input.nextLine());
        System.out.println("Enter employee Id:");
        id = Integer.parseInt(input.nextLine());
        try {  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/world", "root", "root");  
        PreparedStatement stmt=con.prepareStatement("insert into employee values(?,?,?,?)");  
        stmt.setInt(1,id);
        stmt.setInt(2,age);
        stmt.setString(3,fname);  
        stmt.setString(4,lname);
        int q=stmt.executeUpdate();
        con.close();  
        } catch (Exception e) { 
            System.out.println(e);
        } 
        break;
    case 2: 
        int empid;
        System.out.println("Enter the employee ID to delete:");
        empid =Integer.parseInt(input.nextLine());
        try{  
        Class.forName("com.mysql.jdbc.Driver");  
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/world", "root", "root"); 
        PreparedStatement stmt=con.prepareStatement("delete from employee where id=?");  
        stmt.setInt(1,empid);  
        int i=stmt.executeUpdate();    
        con.close();  
        }catch(Exception e){ System.out.println(e);}
        System.out.println("Employee Details deleted succesfully");
        break;
    case 3:
        try{  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/world", "root", "root"); 
        PreparedStatement stmt=con.prepareStatement("select * from employee");  
        ResultSet rs=stmt.executeQuery();  
        while(rs.next()){  
            System.out.println("First Name: "+rs.getString(3)+", "+"Last Name: "+rs.getString(4)+", "+"Age : "+rs.getInt(1)+", "+"Employee ID: "+rs.getInt(2));  
        }      
        con.close();  
        }catch(Exception e){ System.out.println(e);}
        break;
    case 4: 
        System.out.println("Exiting the System!...");
        System.exit(0);
         break;
    default :
        System.out.println("Choose Valid options");
         break;

    }
    }
    }
   }