import java.util.*;  
import java.sql.*;  

class JavaConDemo   
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in);    
System.out.print("Enter Roll number- ");  
int roll= sc.nextInt(); 
sc.nextLine();
System.out.print("Enter Name- ");  
String name= sc.nextLine();  
System.out.print("Enter Batch- ");  
String batch= sc.nextLine(); 


try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/acc_task1","root","");  
PreparedStatement stmt=con.prepareStatement("insert into student_details values(?,?,?)");  
stmt.setInt(1,roll); 
stmt.setString(2,name);  
stmt.setString(3,batch); 
stmt.executeUpdate();  
System.out.println(" records inserted"); 
con.close();  
}catch(Exception e){ System.out.println(e);}   
}
}


