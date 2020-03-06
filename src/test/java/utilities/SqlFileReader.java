package utilities;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlFileReader

{
    public Connection con=null;
    public Statement st=null;
    public SqlFileReader(String sqlFile) throws SQLException, ClassNotFoundException, IOException
    {
        // Setting up Database Connection:
        // Loading the driver:
        Class.forName ("oracle.jdbc.OracleDriver");
        //DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
        // Create  the connection:
        con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
        // create the statement:
        st=con.createStatement();


    }


}