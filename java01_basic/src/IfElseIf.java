
public class IfElseIf {

	public static void main(String[] args) {
		// if~else if문
		// 분류기분이 2이상일때 사용할 수 있다.
		
		int kor = 89;  // 학점

		String grade = "A"; //   char grade = 'A';
		if(kor>=90) {  //   kor>=90 && kor<=100
			grade = "A";
		}else if(kor>=80) { //  kor>=80 && kor<90
			grade = "B";
		}else if(kor>=70) {
			grade = "C";
		}else if(kor>=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println("학점 = "+ grade+"학점");
		
	}
}

/*
90~100   A학점
80~89    B학점
70~79    C학점
60~69    D학점
0~59     F학점


*/