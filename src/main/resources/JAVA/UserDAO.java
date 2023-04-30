import java.sql.*;

public class UserDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public UserDAO() {
        try {
            String dbURL= "jdbc:mysql://localhost:3306/SmartFarmDB";
            String dbID = "admin";
            String dbPassword "admin";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbID, dbPassword);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int login(String userID, String userPassword) {
        String SQL = "SELECT userPassword FROM USER WHERE userID = ?";
        try {
            pstmt = conn.prepareStatement(SQL);
            pstmt = setString(1, userID);
            re = pstmt.executeQuery();

            if (rs.next()) {
                if(rs.getString(1).equals(userPassword))
                    return 1; // 로그인 성공
                else
                    return 0; // 로그인 실패
            }
            return -1; // 아이디가 없음
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -2; // DB오류
    }
    public int join(User user) {
        String SQL = "INSERT INTO VALUES (?, ?, ?, ?");
        try {
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, user.getUserID());
            pstmt.setString(2, user.getUserPassword());
            pstmt.setString(3, user.getUserName());
            pstmt.setString(4, user.getemail());
            return pstmt.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}