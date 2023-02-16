//2148, 2421
public class For02 {

	public static void main(String[] args) {
		// 중첩 반복문
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();//줄바꿈
		}
		
		System.out.println("----------------------");
		for(int i=1; i<=5; i++) {//줄   i= 1,2,3,4,5
			
			for(int j=1; j<=i; j++ ) {//칸  1, 2, 3, 4, 5
				System.out.print("A");
			}
			System.out.println();
		}
		System.out.println("============================");
		//  1 ~5     5 ~1 
		for(int i=5; i>=1 ; i--) {// 5, 4, 3, 2, 1
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
/*

*****
****
***
**
*
		  
*/

	}

}
/*

*****
*****
*****
*****
*****

*
**
***
****
*****

*****
****
***
**
*
*/