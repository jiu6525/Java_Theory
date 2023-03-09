package java10_jdbc_oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectSearchTest {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String username = "scott";
	String password = "tiger";
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			System.out.println("드라이버 로딩 예외...");
		}
	}
	
	Scanner scan = new Scanner(System.in);
	public SelectSearchTest() {
		employee();
	}

	public void employee() {
//		이름을 입력받아 DB조회하기
		try {
			conn = DriverManager.getConnection(url, username, password);
			
			System.out.print("사원명->");
			String name = scan.nextLine();
			
			//? : 데이터 변경되는 곳
			String sql = "select empno, ename, job, to_char(hiredate,'YYYY-MM-DD') hiredate, sal from emp where ename=upper(?)";
			pstmt = conn.prepareStatement(sql);
			// 쿼리문 ? 가 있을때 값을 셋팅
//							index, 값
			pstmt.setString(1,name);// setString(), setInt(), setDouble()........
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {//사원정보가 있을때
				System.out.printf("%d \t%s \t%s \t%s \t%.1f\n",rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
			}else {//사원정보가 없을때
				System.out.println(name+"사원은 존재하지 않습니다.");
			}
			
			
		}catch(Exception e) {
			System.out.println("사원검색 예외 발생..."+ e.getMessage());
		}finally {
			
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		 new SelectSearchTest();

	}

}
