import java.sql.*;

class jdb12
{
    public static void main(String[]args) throws Exception
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
        Statement s=con.createStatement();
        s.addBatch("insert into student values(1,'kishor')");
        s.addBatch("insert into student values(1,'kishor')");
        s.addBatch("insert into student values(1,'kishor')");
        //int r=
        s.executeBatch();
        // if(r==0)
        // System.out.println("insert fail");
        // else
        // System.out.println(r+ " rows inserted");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}