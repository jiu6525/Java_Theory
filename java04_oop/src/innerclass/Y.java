package java04_oop;

public class Y extends X{

	public Y() {
		super(6);
		System.out.print("3");
	}
	Y(int y){
		this();
		System.out.println(4);
	}

	public static void main(String[] args) {
		new Y(5);

	}

}

class X{
	X(){
		System.out.print("1");
	}
	X(int x){
		this();
		System.out.print("2");
	}
}



//네이버 카페 수업자료 - 상속문제1 풀이