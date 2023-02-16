
public class Array02 {

	public static void main(String[] args) {
		// 배열 생성시 초기값 설정하기		
		String colorName[] = new String[]{"RED","GREEN","BLUE","YELLOW", null, null};
		
		for(int idx=0; idx<colorName.length; idx++) {// 0,1,2,3
			System.out.println("colorName["+idx+"]="+ colorName[idx]);
		}

		int jumsu[] = {25,95,36,48,75};
		for(int i=0; i<jumsu.length; i++) {
			System.out.println("jumsu["+i+"]->"+ jumsu[i]);
		}
		
		//확장된 for문
		//    데이터형변수 : 배열형변수, 컬렉션
		for( int data : jumsu ) {
			System.out.println(data);
		}
	}
}
