package com.multi.home;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		로그인 폼
		res.setContentType("text/html; charset=UTF-8");
		
		PrintWriter pw = res.getWriter();
		
		pw.println("<html><head><title>로그인폼</title></head><body>");
		pw.println("<h1>로그인</h1>");
		pw.println("<form method='post' action='/webServlet/login.do'>");
		pw.println("아이디 : <input type='text' name='userid'/><br/>");
		pw.println("비밀번호 : <input type='password' name='userpwd'/><br/>");
		pw.println("<input type='submit' value='Login'/>");
		pw.println("</form></body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		로그인(DB)
		String userid = request.getParameter("userid");
		String userpwd = request.getParameter("userpwd");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
		//1. 드라이브로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		//2. DB연결
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
		
		//3. 쿼리 -> PreparedStatement
		String sql = "select userid, username from register where userid=? and userpwd=?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userid);
		pstmt.setString(2, userpwd);
		
		//4. 실행
		rs = pstmt.executeQuery();
		
		//5. 실행결과에 따른 처리
		if(rs.next()) {//선택된 레코드가 있으면 로그인 성공->session로그인 상태일때 필요한 정보를 기록->홈페이지로 이동한다.
			
			//1. request 아규먼트에서 HttpSession객체를 얻어온다.
			HttpSession session = request.getSession();
			
			//2. 세션영역에 로그인과 관련된 정보 설정
			session.setAttribute("logId", rs.getString(1));
			session.setAttribute("logName", rs.getString(2));
			session.setAttribute("logStatus", "Y");
			
		
			
			//3. 홈으로 이동
			response.sendRedirect("/webServlet/index.do");
			
			
			
		}else {//선택된 레코드가 없으면 로그인 실패->로그인 폼으로 이동하기
			response.setContentType("text/html; charset=UTF-8");
			
			PrintWriter pw = response.getWriter();
			pw.println("<script>");
			pw.println("alert('로그인실패하였습니다.');");
			pw.println("history.back();");
			pw.println("</script>");
			
		}
		
		//6. DB닫기
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally{
			//6. DB닫기
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				
			}
		}
	}

}
