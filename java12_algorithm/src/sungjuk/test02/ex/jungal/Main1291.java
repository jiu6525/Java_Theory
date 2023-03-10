package test02.ex.jungal;

import java.util.Scanner;

public class Main1291 {
 
	public static void gugudan(int s,int e) {
      if (s < e) {//	5 3 -> 5 4 3
          for (int i = 1; i <= 9; i++) {
              for (int j = s; j <= e; j++) {//단
                  System.out.printf("%d * %d = %2d   ", j, i, (j*i));
              }
              System.out.println();
          }
      } else {
          for (int i = 1; i <= 9; i++) {
              for (int j = s; j >= e; j--) {
                  System.out.printf("%d * %d = %2d   ", j, i, (j*i));
              }
              System.out.println();
          }
      }
	}
	
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
 
        while (true){
            int s = sc.nextInt();//시작단
            int e = sc.nextInt();//끝단
            
            if((s < 2 || s > 9) || (e < 2 || e > 9)) {
            	System.out.println("INPUT ERROR!");
            }else {
            	gugudan(s,e);
            	return;
            }
        
        }
    }
}
