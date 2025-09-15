import java.sql.*;

public class jdb2
{
    public static void main(String[]args) throws Exception
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
            Statement s=con.createStatement();
            int r=s.executeUpdate("update student set sname='kk' where sid=1");
            if(r==0)
        System.out.println("insert fail");
        else
        System.out.println(r+ "rows updated");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        }
    }
    
