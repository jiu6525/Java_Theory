import java.util.Scanner;

public class Librarymain  {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int start;
		
		do {
			
			System.out.println("===============도서관리 프로그램===============");
			System.out.println("1.책목록 2.책등록 3.책정보수정 4.책삭제 5.프로그램 종료");
			System.out.print("뭐할거임? : ");
			start = scan.nextInt();
			System.out.println();
			switch(start) {
			
			case 1:
				new BookList().start();
				break;
				
			case 2:
				new InsertBook().start();
				break;
				
			case 3:
				new BookUpdate().start();
				break;
				
			case 4:
				new BookDelete().start();
				break;
				
			case 5:
				break;
			}
		}while(start!=5);

		
		
		
		
		
		
		
		
		
		
		
			} 
	} 



