package test04.structure;

import java.util.Scanner;

import test04.structure.IntQueue.EmptyIntQueueException;
import test04.structure.IntStack.EmptyflowIntStackException;

public class IntQueueTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		IntQueue que= new IntQueue(5);//큐생성하기
	
		while(true) {
			System.out.print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)데이터보기 (6)indexOf (0)종료 : ");
			int menu = scan.nextInt();
			
			
			if(menu==0) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			switch(menu) {
			case 1:// 인큐 : 데이터를 큐에 끝에 추가하기
				System.out.print("데이터 추가 : ");
				int data = scan.nextInt();
				System.out.println();
				try {
					que.enqueue(data);
				}catch(IntQueue.OverflowIntQueueException oiqe){
					System.out.println("큐가 꽉이야\n");
				}
				break;
			case 2:
				try {
					int dequeData = que.deque();
					System.out.println("\ndequq한 값은 " + dequeData + "입니다.");
				}catch(IntQueue.EmptyIntQueueException eiqe){
					System.out.println("\n큐가 비어있습니다.");
				}
				break;
			case 3://peek : 제일 앞데이터 가져오기
				try {
					int firstData = que.peek();
					System.out.println("\n큐의 제일 앞 값" + firstData + "입니다.");
				}catch(IntQueue.EmptyIntQueueException eiwe){
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 4:
				System.out.println();
				System.out.println("큐의 용량은"+que.capacity()+"입니다.");//큐의용량
				System.out.println("큐에는 "+que.size()+"개의 데이터가 있습니다.");//데이터의 수
				System.out.println("큐는 비어"+(que.isEmpty()?"있습니다":"있지 않습니다"));//큐가 비어있는지
				System.out.println("큐는 가득"+(que.isFull()?"찾습니다":"차지 않았습니다"));//큐가 가득찼는지
//				try {
					System.out.println("큐의 마지막값은"+que.peekLast()+"입니다.");//큐의 제일 마지막 데이터 가지고 나오기
					System.out.println("큐의 마지막값은 "+que.pollLast()+"이며 값을 지웠습니다.");//큐의 제일 마지막 데이터 가지고 나오기 지우기
				System.out.println();
//				}catch(IntQueue.EmptyIntQueueException eiwe){
//					System.out.println("큐가 비어있습니다.");
//				}
				break;
			case 5:
				System.out.println(que.dataView());
				System.out.println();
				break;
			case 6:
				System.out.print("찾을값 :");
				int searchData = scan.nextInt();
				int index = que.indexOf(searchData);
				if(index>=0) {
					System.out.println(index+"위치에" + searchData+"가 있습니다");
				}else{
					System.out.println(searchData+"는 큐에 존재하지 않습니다.");
				}break;
				
			default:
				System.out.println("메뉴를 잘못선택하였습니다.");
			}
		}
	
	
	}

}
