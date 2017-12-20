package MySQL;

import javax.activation.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.sql.*;

public class MySQL_Tests {
    public static void main(String [] args) throws SQLException, NamingException {

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://10.20.31.119:3306/JavaTests","java","JavaPassword420!");

            Statement stmt=con.createStatement();
            //stmt.execute("CREATE TABLE tests (column1 INTEGER )");
            stmt.execute("INSERT INTO tests (column1)\n" +
                    "       VALUES (9329);");

            /*
            int valueToInsert = 10;
            PreparedStatement ps = con.prepareStatement("INSERT INTO tests (column1)\n" +
                    "       VALUES ?;");
            ps.setObject(1, valueToInsert);
            //stmt.execute(ps.toString());

            String sql2 = "INSERT INTO tests (column1) VALUES " + valueToInsert + ";";
            stmt.execute(sql2);
            */




            ResultSet rs=stmt.executeQuery("select * from tests");
            while(rs.next())
                System.out.println(rs.getInt(1));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }


}

