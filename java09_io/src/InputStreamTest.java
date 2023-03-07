

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamTest {

	public InputStreamTest() {
//		InputStream :InputStream은 추상메소드를 포함한 추상클래스이므로 상속을 받아서
//					  추상메소드를 오버라이딩해야 한다.
//					  System.in 필드에 객체가 생성되어 있다.
//				입력시 한번에 1byte만 입력한다.
		InputStream is = System.in;
//		read() : 콘솔, 파일, 네트워크에서 자바로 읽어오기
		try {
			while(true) {
//			int code =is.read();//	사용자가 값(문자)를 입력 후 enter 입력시 까지 기다림
//			if(code==13) {
//				break;
//			}
//			System.out.println(code + ","+(char)code);
				
			//read(byte[]) : 한번에 바이트 배열 크기만큼 읽어오기
//							 한글 1글자 = 3byte
			byte data[] = new byte[10];
			int cnt = is.read(data);
			System.out.println(Arrays.toString(data));
			System.out.println("cnt - >" + cnt);
			System.out.println(new String(data,0, cnt)+"-------");
//			byte 배열의 값을 문자열로 변환해서 출력하기
			}
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

	public static void main(String[] args) {
		new InputStreamTest();

	}

}

/*
 *실행
 *Test 
 */
