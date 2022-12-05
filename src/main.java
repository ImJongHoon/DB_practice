import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class main {
    public static void main(String[] args){
        String url = "jdbc:mysql://192.168.56.101:4567/Law_firm_db";
        String userName = "ijh0614";
        String password = "1234";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, userName,password);
            Statement stmt = con.createStatement();

            stmt.executeUpdate("INSERT into Customer Values(1, '임종훈', '010-0000-0000')");

            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
