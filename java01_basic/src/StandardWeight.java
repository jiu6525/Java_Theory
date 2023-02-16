import java.util.Scanner;

public class StandardWeight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//표준체중구하기
		System.out.print("나이=");
		int age = scan.nextInt();
		System.out.print("성별=");
		int gender = scan.nextInt();
		System.out.print("키=");
		double height = scan.nextDouble();
		System.out.print("현재체중=");
		double weight = scan.nextDouble();
		
		//표준체중
		double w = 0.90;
		if(age>=36 && gender==1) {
			w = 0.95;
		}else if(age<36 && gender==2) {
			w = 0.85;
		}
		
		double standardWeight = (height-100)*w;
		
		//표준체중지수
		double standardIndex = (weight/standardWeight)*100;

		//체형
		String standardStr = "";
		if(standardIndex<86) {//마른형
			standardStr = "마른형";
		}else if(standardIndex<96) {//조금마른형
			standardStr = "조금마른형";
		}else if(standardIndex<116) {//표준
			standardStr = "표준형";
		}else if(standardIndex<126) {//조금 비만형
			standardStr = "조금비만형";
		}else {//비만형
			standardStr = "비만형";
		}
		
		//출력
		System.out.println("표준체중="+standardWeight);
		System.out.println("당신의 표준체중지수는 "+ standardIndex +"으로 "+standardStr+"입니다.");		
	}
}
