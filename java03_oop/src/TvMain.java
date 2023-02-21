import java.util.Scanner;

public class TvMain {
	//////////////////////메뉴///////////////////////////////
	public void startMenu() {
		Scanner scan = new Scanner(System.in);
		Tv tv = Tv.getInstance();
		
		do {
			tv.tvInformation();
//			메뉴
			System.out.println("메뉴선택(1:볼륨업, 2:볼륨다운, 3:채널업, 4:채널다운, 5:전원)");
			int menu = scan.nextInt();
			switch(menu) {
			
			case 1: tv.volumeUp(); break;//볼륨업
			case 2: tv.volumeDown(); break;//볼륨다운
			case 3: tv.channelUp();break;//채널업
			case 4: tv.channelDown();break;//채널다운
			case 5: tv.setOnOff();break;//전원

	 
			}
		}while(true);
	}
	
	public static void main(String[] args) {
		TvMain main = new TvMain();
		main.startMenu();

	}

}


