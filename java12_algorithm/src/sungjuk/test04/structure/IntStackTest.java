package test04.structure;

import java.util.Scanner;

import test04.structure.IntStack.EmptyflowIntStackException;
import test04.structure.IntStack.OverflowIntStackException;

public class IntStackTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		스택생성
		IntStack stack = new IntStack(10);//객체생성시 크기설정기능
		
		while(true) {
			System.out.println("현재 데이터 수 : "+stack.size()+", 스택의 크기 : " + stack.capacity());
			System.out.print("(1)PUSH (2)POP (3)PEEK (4)DUMP (5)SEARCH (6)EMPTY(clear) (7)스택정보표시 (8)REMOVE (0)종료->");
			int menu = scan.nextInt();
			
//			메뉴가 0이 입력되면 종료
			if(menu==0) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
			switch(menu) {
			case 1: //push - 데이터담기
				System.out.print("데이터 값 : ");
				int data = scan.nextInt();
				System.out.println();
				
				try {
					stack.push(data);
				}catch(OverflowIntStackException oise){
					System.out.println("\n스택이 가득찼습니다.");
				}
				break;
			case 2:	//pop - 스택에서 마지막 담은 값 꺼내기
				try {
					int popData = stack.pop();
					
					System.out.println("\npop한 값은 " + popData + "입니다.");
				}catch(EmptyflowIntStackException eise){
					System.out.println("\n스택이 비어있습니다.");
				}
				break;
			case 3: //peek - 스택에서 마지막 데이터를 확인하는 메소드
				try {
					int peekData = stack.peek();
					System.out.println("\n스택의 제일 꼭대기 값은 " + peekData + "입니다.");
				}catch(EmptyflowIntStackException eise){
					System.out.println("\n스택이 비어있습니다.");
				}
				break;
			case 4://dump - 스택의 모든 데이터를 출력하는 메소드
				System.out.println(stack.dump());
				break;
			case 5://search - 스택에서 데이터의 위치를 반환하는 메소드
				System.out.println("찾을 데이터:");
				int searchData = scan.nextInt();
				int result = stack.indexOf(searchData);
				if(result>=0) {
					System.out.println(searchData+"는"+"스택에 "+result+"위치에 있습니다");
				}else {
					System.out.println(searchData+"는 스택에 없습니다.");
				}
				break;
			case 6: // empty - 스택 비움
				stack.clear();
				break;
			case 7:// 스택정보표시
				System.out.println("용량 : " + stack.capacity());//용량
				System.out.println("데이터 수 : " + stack.size());//데이터수
				System.out.println("비어" + (stack.isEmpty() ?"있습니다.":"있지 않습니다."));//스택비어있는지 여부
				System.out.println("스택이 가득 " +(stack.isFull()?"찾습니다.":"차지 않았습니다."));//스택가득찾는지 여부
				break;
			case 8:
				System.out.print("삭제할 값 : ");
				int delData = scan.nextInt();
				boolean delResult = stack.equals(stack.remove(delData));
				if(!delResult) {
					System.out.println(delData+"가 스택에서 삭제 되었습니다.");
				}else {
					System.out.println(delData + "를 삭제하지 못하였습니다.");
				}
				break;
			default : 
				System.out.println("\n메뉴를 잘못입력하였습니다.");
			}
		}
	}

}
