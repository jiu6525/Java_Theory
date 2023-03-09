package java10_jdbc_oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {
	public SelectTest() {
		start();
	}
	public void start() {
		//oracle데이터베이스 레코드 선택하기
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
//			1. JDBC드라이버를 자바 가상머신에 등록한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			2. DB연결						
//			  					localhost, 127.0.0.1:port:sid
			String url ="jdbc:oracle:thin:@localhost:1521:xe";//2^26=65535
			
			//					DB서버주소, 계정, 비번
			conn = DriverManager.getConnection(url,"scott","tiger");
			
//			3. sql 작성후 Statement생성하기
			String sql = "select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp"
					+ " order by ename asc";
			
			pstmt = conn.prepareStatement(sql);
//			select에 의해서 선택된 레코드 rs에 저장되어 있다.
			rs = pstmt.executeQuery();
			
			while(rs.next()) {//레코드가 있으면 true, 레코드가 없으면 false
//				현재 point의 레코드가 얻어올수 있다.
				int empno = rs.getInt(1);// rs.getInt("empno");
				String ename = rs. getString(2);
				String job = rs.getString(3);
				int mgr = rs.getInt(4);
				String hiredate = rs.getString(5);
				double sal = rs.getDouble(6);
				double comm = rs.getDouble(7);
				int deptno = rs.getInt(8);
				
				System.out.println(empno+"\t"+ename+"\t"+mgr+"\t"+hiredate+"\t"+sal+"\t"+comm+"\t"+deptno+"\t"+job);
			}
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println("JDBC드라이버 오류..." + cnfe.getMessage());
		}catch(SQLException se) {
			System.out.println("DB연결 예외 발생...."+se.getMessage());
		}finally {
			try {
//			DB닫기
				if(rs != null)rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch (SQLException s){
				System.out.println("DB닫기 예외 발생.....");
			}
		}
	}
	public static void main(String[] args) {
		 new SelectTest();

	}

}









