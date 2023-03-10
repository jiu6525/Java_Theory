package sungjuk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Array2Ex04myGet {
	 static String[][] group=new String[12][7];  //2차원 배열 정의
	 static int rank[] =new int[10];
	 static int tot;
	 static double avg;
	 
	 
	public static void start() throws Exception {
			BufferedReader br = new BufferedReader(new FileReader(new File("c://java_test/sungjuk.txt")));
			for(int i=0;i<group.length-2;i++) {
				tot = 0;
				avg = 0;
				
//				반복문을 통해 성적파일에서 한줄씩 얻어옴
				String str=br.readLine();
				
//				StringTokenizer클래스를 이용해 문자 분리
				StringTokenizer st = new StringTokenizer(str,",");
				
//				총점값,평균,등수 부분을 제외한 값 입력
				for(int j=0;j<group[i].length-3;j++){
					group[i][j] = st.nextToken();
					if(j>=1&&j<=3) {
						tot += Integer.parseInt(group[i][j]);
					}
					rank[i] = tot;
					avg = Math.ceil(tot/3.0);
				}
				
				
				
//				배열에 총점, 평균 입력하기
				group[i][group[i].length-3] =String.valueOf(tot);
				group[i][group[i].length-2] =String.valueOf((int)avg);
				}
			
			
			
//			getRank를 통해 배열에 저장
			for(int i=0; i<rank.length;i++) {
				group[i][6] = getRank(rank[i]);
				}
			
			
//			(행) 과목별 총점,평균 배열에 입력
			getTa();

		
		
//			실행문
		for(int i=0;i<group.length;i++) {
			for(int j=0;j<group[i].length;j++) {
				System.out.print(group[i][j]+"\t");
			}System.out.println();
		}
		}
		
	
			
//			(행) 과목별 총점,평균 구하기
	public static void getTa() {
		group[10][0]="과목별총점";
		group[11][0]="과목별평균"; 
		for(int j=1;j<=3;j++) {
			tot =0;
			avg = 0;
			for(int i=0;i<group.length-2;i++) {
				tot += Integer.parseInt(group[i][j]);
				avg = Math.ceil(tot/10.0);
			}
			group[10][j] = String.valueOf(tot);
			group[11][j] = String.valueOf((int)avg);
		}
		
		for(int i=10;i<group.length;i++) {
			for(int j=4;j<group[i].length;j++) {
				group[i][j] = "0";
			}
		}
	} 	
			  
			

//			등수구하기
	public static String getRank(int a) {
		int count = 1;
			
		for(int i=0;i<rank.length;i++) {
				if(rank[i]>a) {
					count++;
				}
			}
		return String.valueOf(count);
	}
			
	
	public static void Array2() {}
}

		
	


