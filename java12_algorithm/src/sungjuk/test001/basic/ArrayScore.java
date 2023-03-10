package test001.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArrayScore {
//	학생이름을 저장할 변수
	static String stdName[];
//	각 과목점수, 개인별총점, 평균, 석차, 과목별 총점, 과목별 평균
	static int stdScore[][];
//	학생수
	static int stdCount;
//	과목수
	static int subjectCount;
	public ArrayScore() {
	}

//	이름과 정수를 배열에 저장
	public static void setData() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("src/test001/basic/sungjuk.txt")));
		
//		학생수 읽어오기
		stdCount = Integer.parseInt(br.readLine());
		subjectCount = Integer.parseInt(br.readLine());
		
//		학생이름,점수를 2차원배열에 기본데이터 셋팅하기
		stdName = new String[stdCount];
		stdScore = new int[stdCount+2][subjectCount+3];	// 12행,6열인 2차원배열 생성
		
		for(int i=0; i<stdCount;i++) {//i=0,1,2,3,4,5.....9	1	2	3
			String line[]= br.readLine().split(",");// "블랙핑크,85,92,25"
			stdName[i] = line[0];// i를 stdName index로 사용
//			점수
			for(int j=0;j<subjectCount; j++) {// 0,1,2
				stdScore[i][j] = Integer.parseInt(line[j+1]);
			}
		}
	}
	
//	성적처리
	static void scoreProcess() {
//		개인별총점, 개인별평균, 과목별총점, 과목별평균
// 			학생수 만큼 반복	0,1,2...9
		for(int r=0; r<stdCount; r++) {
//			과목수 만큼 반복	0,1,2
			for(int c=0; c<subjectCount; c++) {
				stdScore[r][subjectCount] += stdScore[r][c];//개인별 총점
				stdScore[stdCount][c] += stdScore[r][c];
			}
//			개인별 평균
			stdScore[r][subjectCount+1] = stdScore[r][subjectCount]/subjectCount;
		}
		
		
		for(int c=0; c<subjectCount; c++) {//0,1,2
			stdScore[stdCount+1][c] = stdScore[stdCount][c]/stdCount;//과목별 평균
		}
		scoreRank();
	}
	
	static void scorePrint() {
		for(int r=0; r<stdScore.length; r++) {// r=0,1,2,.....10,11
			if(r<stdCount)System.out.printf("%-8s", stdName[r]);
			if(r==stdCount)System.out.printf("%-8s","과목별 총점");
			if(r==stdCount+1)System.out.printf("%-8s","과목별 평균");
			
//			점수
			for(int c=0; c<stdScore[r].length; c++) {//c=0,1,2....5
				System.out.printf("%5d",stdScore[r][c]);
			}
			System.out.println();	
		}

	}
	
	static void scoreRank() {
		for(int p=0; p<stdCount; p++) {//0,1,2.....stdCount
//			p위치의 값이 내점수
//			나보다 높은 점수의 수를 구한다.
			for(int r=0; r<stdCount; r++) {
//							내점수						상대방
				if(stdScore[p][subjectCount] < stdScore[r][subjectCount]) {
					stdScore[p][subjectCount+2] ++;
				}
			}
			stdScore[p][subjectCount+2] ++;//내등수
		}
		
	}
	
	
	public static void main(String[] args) throws Exception {
		setData();//기본점수 설정 끝남.
		scoreProcess();
		scorePrint();
	}

}
