package test06.linkedlist;

public class Data {
//	번호와 이름을 보관할수 있는 내부클래스로 생성하기

		private Integer no;
		private String name;
		
		public Data() {}
		public String toString() {
			return no+":"+name;
		}
		
		public Integer getNo() {
			return no;
		}
		
		public void setNo(Integer no) {
			this.no = no;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}


}
