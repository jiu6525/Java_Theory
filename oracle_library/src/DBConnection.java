import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
//		변수
		protected Connection con = null;
		protected PreparedStatement pstmt = null;
		protected ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String username = "scott";
		String password = "tiger";
		
		protected String sql = null;
		
		static {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			}catch(Exception e) {
				System.out.println("드라이버 로딩 예외...");
			}
		}
		
		
//		DB연결
		public void getConnection() {
			try {
				con = DriverManager.getConnection(url,username, password);
			} catch (SQLException e) {
				System.out.println("DB연결예외 발생..");
				e.printStackTrace();
			}
		}
		
		
//		DB닫기
		public void dbClose() {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
}
