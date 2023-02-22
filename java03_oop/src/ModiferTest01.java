import com.multi.Student;

public class ModiferTest01 {

	public ModiferTest01() {
//		접근제한자는 public>protected>default(생략)>private
//		public : 공용
//		default : 같은 패키지내에서만 허용
//		객체생성
//		생성자 메소드가 public
		Student student = new Student();
		
		System.out.println("이름 = " + student.name);
		
		student.studentPrint();
	}

	public static void main(String[] args) {
		new ModiferTest01();

	}

}
