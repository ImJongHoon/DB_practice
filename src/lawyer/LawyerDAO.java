package lawyer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LawyerDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public LawyerDAO() {
        try {
            String dbURL = "jdbc:mysql://localhost:4567/Law_firm_db";
            String dbID = "ijh0614";
            String dbPassword = "1234";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


}
