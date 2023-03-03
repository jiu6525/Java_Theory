import java.util.Stack;

public class StackTest {

	public StackTest() {
		// Stack객체 생성
		Stack<String> nameStack = new Stack<>();
		
		nameStack.push("이순신");
		nameStack.push("세종대왕");
		nameStack.push("BTS");
		nameStack.push("BlackPink");
		nameStack.push("김삿갓");
		
		while(!nameStack.empty()) {//비어있으면 true,  객체가 있으면 false
//			 pop() : 객체를 꺼낸후 지워짐
			System.out.println(nameStack.pop() +", "+nameStack.size());
			
		}
	}

	public static void main(String[] args) {
		new StackTest();

	}

}
