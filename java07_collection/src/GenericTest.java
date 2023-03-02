/*
 	V : value
 	K : key
  	E : element
  
 */



public class GenericTest<V,E> {
	private V num;
	private E name;
	
	public GenericTest() {}
	
	@Override
	public String toString() {
		return "num=" + num + ", name=" + name;
	}
	
	public V getNum() {
		return num;
	}
	public void setNum(V num) {
		this.num = num;
	}
	public E getName() {
		return name;
	}
	public void setName(E name) {
		this.name = name;
	}

}
