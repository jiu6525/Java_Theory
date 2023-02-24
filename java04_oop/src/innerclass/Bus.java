package java04_oop;

//Car클래스를 상속받는다. 상속은 1개만 받을 수 있다.
//	Car, Object
//상속관계에서 생성자 메소드는 상위클래스의 생성자를 먼저 실행하고 하위클래스의 생성자를 실행한다.
public class Bus extends Car {
	int maxSpeed = 150;

	public Bus() {
//		하위 클래스의 생성자 메소드에서 상위클래스의 원하는 생성자 메소드를 호출하기
//		첫번째 실행문이여야 한다.
//		this() : 현재클래스
//		super() : 상위클래스의 생성자
		super("그랜저","black");
		System.out.println("Bus()생성자");

	}
	public void output() {
		System.out.println("모델===>" + model);
		System.out.println("색상===>" + color);
		System.out.println("최고속도===>" + maxSpeed);
//		상위클래스의 멤버변수 maxSpeed		supper
		System.out.println("Car의 최고속도 -->" + super.maxSpeed);
	}

	
//	오버라이딩(override) 상위 클래스의 메소드 재정의
//	메소드명, 매개변수의 갯수, 데이터형이 같아야 한다.
//	접근제어자 상위클래스의 접근제어자 넓은 의미의 제어자이여야 한다.
	public void speedUp() {
		super.speedUp();	//하위에서 오버라이딩 된 메소드의 상위클래스 메소드 호출하기
		speed += 10;
		if(speed>=maxSpeed) {
			speed = maxSpeed;
		}
	}
	public static void main(String[] args) {
		Bus bus = new Bus();
		System.out.println(bus.maxSpeed);
		bus.output();
		bus.speedUp();
		System.out.println(bus.speed);
	}

}
