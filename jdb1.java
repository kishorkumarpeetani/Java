import java.sql.*;

class jdb1
{
    public static void main(String[]args) throws Exception
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java2","root","");
        Statement s=con.createStatement();
        int r=s.executeUpdate("insert into stude values(2,'kishor')");
        if(r==0)
        System.out.println("insert fail");
        else
        System.out.println(r+ "rows inserted");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}