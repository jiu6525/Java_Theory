package test06.linkedlist;

public class LinkedListData<E> {
//	노드
//	Data에 저장된 번호와 이름을 보관
//	다음객체주소를 보관한다.
	class Node<E>{
		private E data; //현재 데이터
		private Node<E> next; //다음 데이터 포인트
//		생성자 메소드
		Node(E data, Node<E> next){
			this.data = data;
			this.next = next;
		}
	}
	//--------------------------------------
	private Node<E> head; //머리노드를 가질 변수
	private Node<E> ctrl; //선택노드를 가질 변수
	
//	생성자
	LinkedListData(){
//		최초 객체 생성시 머리노드와 선택노드는 null로 초기화
		head = ctrl = null;
	}
	
//	머리에 노드 삽입
	public void addFirst(E obj) {
//		머리노드가 null인경우 List가 비어 있고
//		아닌경우 현재노드의 next로 설정한다.
		Node<E> ptr = head;
		head = ctrl = new Node(obj,ptr);
	}
//	꼬리에 노드 삽입
	public void addLast(E obj) {
//		노드가 1개도 없으면
		if(head==null) {
			addFirst(obj);
		}else {//노드가 1개이상 일때
//			마지막 노드를 찾아서 obj를 다음노드로 설정한다.
			Node<E> ptr = head;
			while(ptr.next != null) {
				ptr = ptr.next;
			}
			
		ptr.next = ctrl = new Node(obj,null);
			
		}
	}
	public void remove(Node n) {
//		노드가 있는지 확인
		if(head != null) {//노드가 있다면
//			head노드 인경우
			if(head == n) {
				removeFirst();
			}else {
				Node<E> ptr = head;
				while(ptr.next != n) {
					ptr = ptr.next;
					if(ptr == null) return;//n이 존재하지 않는다.
				}
				ptr.next = n.next;
				ctrl = ptr;
			}
		}
	}
//	선택노드 삭제
	public void removeCurrentNode() {
		remove(ctrl);
	}
//	머리노드 삭제
	public void removeFirst() {
//		제일앞 노드 삭제하기
		if(head != null) {//머리노드가 있다.
			head = ctrl = head.next;
		}
	}
//	모든 노드를 출력
	public void dump() {
		Node<E> ptr = head;
		
		while(ptr != null) {//ptr가 null이 아니면 노드가 존재한다.
			System.out.println(ptr.data.toString());
			ptr = ptr.next;
		}
	}
}
