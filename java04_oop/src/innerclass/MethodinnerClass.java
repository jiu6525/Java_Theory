package innerclass;

public class MethodinnerClass {
	String email = "jiu6525@daum.net";
	public MethodinnerClass() {
		System.out.println("MethodInnerClass() 생성자메소드");
	}
	
	public void emailOutput() {
		System.out.println("이메일 =>" +email+"\n============");
	}
	public void createInner() {
//		2. 메소드에 생성하는 내부클래스
//		외부클래싀 정보와 메소드내에서 정의 정보를 사용가능
		int num = 100;
		class InnerClass{
			String name = "세종대왕";
			InnerClass(){
				System.out.println("num===========>" + num);
				System.out.println("name==========>" + name);
//				System.out.println("tel==========>" + tel);		클래스 정의 이전에 선언한 정보사용가능
			}
			void getInformation() {
//				외부클래스의 메소드 호출
				emailOutput();
				System.out.println("email*******:" + email);
				System.out.println("addr********:" + addr);
			}
		}
		String tel = "010-4163-6525";
		
//		메소드에서 정의한 내부클래스 객체 만들기
		InnerClass ic = new InnerClass();
		ic.getInformation();
		
	}
//	외부의 멤버영역(클래스 영역)
	String addr = "서울시 성동구";
	public static void main(String[] args) {
		MethodinnerClass mic = new MethodinnerClass();
		mic.createInner();

	}

}
