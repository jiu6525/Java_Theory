package java10_jdbc_oracle;

import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class InsertProcedure extends DBConnection{
	Scanner scan = new Scanner(System.in);
	public InsertProcedure() {
		// TODO Auto-generated constructor stub
	}
	public void insertStart() {
//		콘솔에서 사원정보를 입력받아 DB에 등록하는 클래스
//		책이름, 가격, 출판일, 카테고리, 작가명, 출판사명
		System.out.print("도서명->");
		String bookname = scan.nextLine();
		
		System.out.print("가격->");
		int price = Integer.parseInt(scan.nextLine());
		
		System.out.print("출판일(dP:2022-09-10)->");
		String pub_date = scan.nextLine();
		
		System.out.print("카테고리->");
		String category = scan.nextLine();
		
		System.out.print("작가명->");
		String author = scan.nextLine();
		
		System.out.print("출판사명->");
		String pub_name = scan.nextLine();
		
		try {
			// DB연결
			getConnection();
			
			//프로시저 호출
			//	   {call 프로시저명(값1, 값2,.....)}
			sql = "{call booksInsert(?, ?, ?, ?, ?, ?, ?)}";	//문자열 매개변수 갯수 동일하게 ?로 표시한다....
			
		
			cstmt = con.prepareCall(sql);
			// 데이터 셋팅
			cstmt.setString(1, bookname);//책이름
			cstmt.setInt(2, price);//가격
			cstmt.setString(3, pub_date);//출판일
			cstmt.setString(4, category);//카테고리
			cstmt.setString(5, author);//작가명
			cstmt.setString(6, pub_name);//출판사명
			
			// 프로시저에서 out받을 물음표
			cstmt.registerOutParameter(7, Types.INTEGER);// 결과 담김
			
			//실행
			cstmt.executeUpdate();
			
			// 실행결과
			if(cstmt.getInt(7)>0) {// 도서등록된 경우
				System.out.println(bookname+"이 등록되었습니다.");
			}else {//도서등록이 안된경우
				System.out.println(bookname+"이 등록되지 않았습니다.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbClose();
		}
		
	}
	
	public static void main(String[] args) {
		InsertProcedure ip = new InsertProcedure();

		ip.insertStart();
	}

}
