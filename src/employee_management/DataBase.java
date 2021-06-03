package employee_management;
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {

  public static Connection dbconnect(){
       Connection cons =null;
     
        try {
            
        
                   Class.forName("com.mysql.jdbc.Driver");
             
                   cons = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
        
        } catch (Exception ex) {  }    
       
        return(cons);
    }
    
}
