package com.multi.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/init.do")
public class InitParamTest extends HttpServlet {
	String userid;
	String username;
    public InitParamTest() {
        super();

    }


	public void init(ServletConfig config) throws ServletException {
		userid = config.getInitParameter("userid");
		username = config.getInitParameter("username");
		
		System.out.println("userid="+ userid+", username="+username);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//web.xml의 <init-param>태그의 데이터를 가져오기
		//System.out.println("doGet()메소드 실행됨123.");
		response.setContentType("text/html; charset=UTF-8");
		
		//접속자의 웹브라우저로 서버에서 응답하기
		PrintWriter pw = response.getWriter();
		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>서블릿 페이지</title>");
		pw.println("<script>alert('자바스크립트 실행됨.');</script>");
		pw.println("</head><body>");
		
		pw.println("<p>아이디 : " + userid+"</p>");
		pw.println("<p>이름 : " + username+"</p>");
		
		pw.println("</body></html>");
	}

}
