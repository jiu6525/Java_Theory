package com.multi.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


// 서블릿 클래스는 HttpServlet을 상속받아 생성한다.
@WebServlet("/index.do")
public class IndexServlet extends HttpServlet {

    public IndexServlet() {
        super();
    }

    //get방식 접속 또는 post방식으로 접속을 하면 doGet(), doPost()가 실행되기 전에 먼저 실행되는 메소드
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()메소드 실행됨2.");
	}

	//클라이언트가 서버에 get방식으로 접속하면 호출되는 메소드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><head><title>홈페이지</title></head><body>");
		
		//로그인 여부확인
		HttpSession session = request.getSession();
		
		if(session.getAttribute("logStatus")==null || !session.getAttribute("logStatus").equals("Y")) {
			pw.println("<h2><a href='/webServlet/login.do'>로그인</a></h2>");
		}else{
			pw.println("<h2>"+ session.getAttribute("logName") + "<a href='/webServlet/logout.do'>로그아웃</a></h2>");
		}
			pw.println("</body></html>");
		
	}

	//클라이언트가 서버에 post방식으로 접속하면 호출되는 메소드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	//접속이 종료되면 실행되는 메소드
	public void destroy() {
		
	}

}
