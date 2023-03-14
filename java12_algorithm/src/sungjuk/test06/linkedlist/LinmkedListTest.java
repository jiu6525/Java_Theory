package test06.linkedlist;

import java.util.Scanner;

public class LinmkedListTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu;; //메뉴저장
		Data data;
		LinkedListData<Data> list = new LinkedListData<Data>();
		
		
//		메뉴만들기
		do {
			System.out.print("1:머리에 노드를 삽입, 2:꼬리에 노드를 삽입,"
				+ "3.머리노드 삭제, 4:선택노드 삭제, 5: 모든 노드를 출력, 6:종료?->");
			menu = Integer.parseInt(scan.nextLine());
			
			switch(menu) {
			case 1:
				System.out.println("머리에 노드를 삽입하기");
				data = new Data();
				System.out.print("번호입력 : ");//1
				data.setNo(Integer.parseInt(scan.nextLine()));
				System.out.print("이름 입력 : ");//홍길동
				data.setName(scan.nextLine());
//				
				list.addFirst(data);
				break;
			case 2:
				System.out.println("꼬리에 노드 추가하기");
				data = new Data();
				System.out.print("번호입력");
				data.setNo(Integer.parseInt(scan.nextLine()));
				System.out.print("이름입력");
				data.setName(scan.nextLine());
				list.addLast(data);
				break;
			case 3://머리노드 삭제
				list.removeFirst();
				break;
			case 4://선택노드 삭제
				list.removeCurrentNode();
				break;
			case 5:
				list.dump();
				break;
			}
		}while(menu!=6);
			System.out.println("프로그램이 종료");
	}

}
