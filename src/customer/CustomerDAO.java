package customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet;

public class CustomerDAO {

    private Connection conn;
    private PreparedStatement pstmt;

    public CustomerDAO() {
        try {
            String dbURL = "jdbc:mysql://192.168.56.101:4567/Law_firm_db";
            String dbID = "ijh0614";
            String dbPassword = "1234";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public int join(Customer customer) {

        try {
            String SQL = "INSERT INTO Customer VALUES (?,?,?)";
//            String SQL2 = "SELECT COUNT(*) as Cust_id FROM Customer";
//            int id_num = 0;

            //id 갯수 가져오기
//            pstmt = conn.prepareStatement(SQL2);
//            id_num = ( pstmt.executeUpdate() + 1 );

            pstmt = conn.prepareStatement(SQL);
            pstmt.setInt(1, 1);
            pstmt.setString(2, customer.getCustomer_name());
            pstmt.setString(3, customer.getCustomer_phone());

            pstmt.executeUpdate();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return 0;
    }
}
