package test001.basic;

public class Exe1 {
	static int rank[] = {202,281,173,261,228,242,210,248,189,217}; 
	public static String getRank(int a) {
		int count = 1;
		
		
		
		for(int i=0;i<rank.length;i++) {
				if(rank[i]>a) {
					count++;
				}
		}
		return String.valueOf(count);
		}
	public static void main(String[] args) {
		for(int i=0; i<rank.length;i++) {
		System.out.println(getRank(rank[i]));
		}
	}

}
