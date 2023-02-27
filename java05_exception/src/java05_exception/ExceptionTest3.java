package java05_exception;

import java.util.Scanner;

public class ExceptionTest3 {

	public ExceptionTest3() {
		
	}

//	문자열입력받기
//	public void inData() throws NumberFormatException, ArithmeticException,ArrayIndexOutOfBoundsException {
	public void inData() throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째수->");
		String n1 = scan.nextLine();	//콘솔에서 한줄씩 입력한다.(enter포함) String 리턴
		System.out.println("두번째수->");
		String n2 = scan.nextLine();
		int n1Int = Integer.parseInt(n1);	//문자열을 정수형 int변환해주는 메소드
		int n2Int = Integer.parseInt(n2);
		divide(n1Int, n2Int);
	}
//	public void divide(int n1,int n2) throws ArithmeticException,ArrayIndexOutOfBoundsException {
	public void divide(int n1,int n2) throws Exception{
		int result = n1/n2;	// <--------
		System.out.printf("%d / %d = %d\n",n1,n2,result);
		array();
	}
	
//	public void array() throws ArrayIndexOutOfBoundsException {
	public void array() throws Exception{
		int data[] = {25,52,6,4};
		System.out.println(data[4]);
	}
	
	
	
	public static void main(String[] args) throws Exception {
		try {
			ExceptionTest3 et3 = new ExceptionTest3();
			et3.inData();
//		}catch(NumberFormatException nfe) {
//			System.out.println("입력값은 숫자여야 합니다.");
//		}catch(ArithmeticException ae) {
//			System.out.println("0으로 나눌 수 없어요.");
//		}catch(ArrayIndexOutOfBoundsException ae) {
//			System.out.println(ae.getMessage());

		}catch(Exception e) {
			System.out.println("예외발생함........");

}
}
}