
public class Array04Copy {

	public static void main(String[] args) {
		// 배열의 복사
		// 배열은 생성이 되면 크기를 변경할수 없다.
		// 새로 배열을 생성하여 기존 배열의 정보를 복사하기
		
		// System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		
		int data[] = {54,87,15,79,34,79,32};
		
		//새로운 배열을 생성하여 원래값(일부, 전체) 복사
		int targetData[] = new int[20];
		//               원본배열명,원본복사시작위치,target배열명,타켓시작위치, 복사데이터갯수
		System.arraycopy(data,    2,          targetData, 3,         4);
		for(int i=0; i<targetData.length; i++) {
			System.out.println("targetData["+i+"]="+ targetData[i]);
		}
	}

}
