import java.sql.*;

class jdb4
{
    public static void main(String[]args) throws Exception
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
        Statement s=con.createStatement();
        ResultSet r=s.executeQuery("select * from student");
        while(r.next())
        {
            System.out.println(r.getInt(1)+" " +r.getString(2));
        }
        con.close();
        s.close();
        r.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}