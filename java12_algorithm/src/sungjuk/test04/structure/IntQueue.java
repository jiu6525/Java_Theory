package test04.structure;

import test04.structure.IntStack.EmptyflowIntStackException;

public class IntQueue {
	private int max;//용량
	private int front;//앞쪽(데큐)위치
	private int rear;//뒤쪽(인큐)위치
	private int num;//데이터의 수
	
	
	private int queue[];//queue 처리할 배열
	
	public IntQueue() {
		this(10);
	}
	
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		
		try {
			queue = new int[max];
		}catch(OutOfMemoryError oome) {
			max = 0;
		}
	}
//		인큐 : 큐의 마지막에 데이터 추가
		public int enqueue(int data) {
//			큐가 가득찼는지 확인후 예외발생
			if(max ==num) {
				throw new OverflowIntQueueException();
			}
//			큐가 여유가 있을때
//			rear의 위치에 데이터 담고 rear는 1증가	
			queue[rear++] = data;
			num++; //데이터수 증가
			
//			용량과 rear가 같으면 배열의 범위를 벗어남.		rear 초기화 = 0
			if(max==rear) rear =0;
			
			return data;
		}
//		디큐 : 데이터 꺼내기, 지워짐
		public int deque() throws EmptyIntQueueException{
//			큐가 비어 있는지 확인
			if(num==0) {
				throw new EmptyIntQueueException();
			}
//			front 의 값을 구하고 다음위치 값으로 설정하기 위해 1증가
			int dequqData = queue[front++];
//			데이터의 갯수 감소
			
			num--;
			
			if(front == max) {
				front = 0;
			}
			
			return dequqData;
		}
//		peek : front위치의 데이터 구함. 값 지워지지 않음
		public int peek() {
			if(num==0) {
				throw new EmptyIntQueueException();
			}
			return queue[front];
		}
//		indexOf : 값이 있는위치
		public int indexOf(int data) {
//			데이터가 있으면 index반환
//			데이터가 없으면 -1반환
//			
			for(int i=0; i<num; i++) {//5->0,1,2,3,4	3->0,1,2
				int idx = (front+i) % max;
				if(queue[idx] == data) {//index 위치의 값이 찾는 값과 같을때
					return idx;
				}
			}
			return -1;//찾는 값이 없을때
		}
//		데이터 보기
		public String dataView() {
			String str = "";
			for(int i=0; i<max; i++) {
				str += "queue[" + i + "] = " + queue[i];
				if(i!= max-1) str += ", ";
			}
			return str;
		}
		
		//**********************************************************************
//		큐의 용량
		public int capacity() {
			return max;
		}
//		큐의 데이터의 수
		public int size() {
			return num;
		}
//		큐가 비어있는지 확인
		public boolean isEmpty() {
			return num <= 0;
		}
//		큐가 가득찾는지 확인
		public boolean isFull() {
			return num == max;
		}
//		큐의 마지막값 리턴
		public int peekLast() {
			if(isEmpty()) {
				return -1;
			}
//			rear의 이전 위치의 값
			int idx = rear-1;
			if(idx==-1)idx = max-1;
			return queue[idx];

		}
//		큐의 마지막값을 리턴하고 삭제
		public int pollLast() {
			if(isEmpty()) {
				return -1;
			}
			
			int idx = rear-1;
			if(idx == -1) idx = max-1;
			
			rear = idx;
			num--;
			return queue[idx];
		}

		
		//**********************************************************************
		
//		------------------------------------------------------------------------
//		오버플로우 예외
		public class OverflowIntQueueException extends RuntimeException{
			public OverflowIntQueueException() {}
		}
//		Empty 예외
		public class EmptyIntQueueException extends RuntimeException{
			public EmptyIntQueueException() {}
		}
//		------------------------------------------------------------------------
 }

