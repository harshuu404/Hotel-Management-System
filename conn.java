package hotel.management.system;




import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:/// hotelmanagementsystem","root","100403"); 
            
            s =c.createStatement();              
      String sql = "CREATE TABLE employee" +
                "(name varchar(100) ,age varchar(10),"+
              "gender varchar(30),job varchar(30),"+
               "salary varchar(30) ,phone varchar(30),"+
               " aadhar varchar(30) ,email varchar(40))" ;
      String room="select * from room";

            
        s.executeUpdate(sql);
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}