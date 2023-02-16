import java.util.Scanner;

public class Ex03For {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수=");
		int max = scan.nextInt();
		
		int sum=0, oddSum = 0, evenSum = 0, threeSum = 0;  
		for(int i=1; i<=max; i++) {// 1,2,3,4,5.....max
			sum += i;//합  sum = sum + i;
			if(i%2==1){//홀수
				oddSum += i;
			}else{//짝수
				evenSum += i;
			}
			if(i%3==0) {//3의 배수
				threeSum += i;
			}
		}
		System.out.println("1~"+max+"까지의 합은 "+ sum);
		System.out.println("1~"+max+"까지의 홀수의 합은 "+ oddSum);
		System.out.println("1~"+max+"까지의 짝수의 합은 "+ evenSum);
		System.out.println("1~"+max+"까지의 3의 배수의 합은 "+ threeSum);
	}
}
/*

[실행]
정수(5이상)?9   //    1,2,3,4,5,6,7,8,9
1~9까지의 합은 45
1~9까지의 홀수의 합은 25 
1~9까지의 짝수의 합은 20
1~9까지의 3의 배수의 합은 18  
*/
