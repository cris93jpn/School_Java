import java.util.Scanner;

public class section_11 {
	public static void main(String[] args) {
		//Scannerの準備
		Scanner in = new Scanner(System.in);
		//人数の入力
		System.out.println("人数を入力してください。");
		int per = in.nextInt();
		PersonCard[] card = new PersonCard[per];
		//人数分の情報入力
		for (int i = 0; i < per; i++) {
			System.out.println((i+1) + "メンバー入力ーーーー");
			System.out.println("名前を入力してください。");
			String na = in.next();
			System.out.println("級を入力してください。(1～8)");
			int sho = in.nextInt();
			System.out.println("学年を入力してください。");
			int nen = in.nextInt();
			card[i] = new PersonCard(na, sho, nen);
			card[i].ColorType();
		}
		
		//赤いキャップの生徒情報表示
		System.out.println("ーー赤キャップーー");
		for (int i = 0; i < card.length; i++) {
			if (card[i].color == "赤") {
				card[i].printInfo();
			}
		}
		
		int persons = 0;
		for (int i = 0; i < card.length; i++) {
			if (card[i].year == 6) {
				persons++;
			}
		}
		
		System.out.println("6年生の人数：" + persons);
		
		//赤いキャップの生徒情報表示
		System.out.println("青キャップ人数：" + PersonCard.blue );
		String hyo = PersonCard.CountPer(card);
		System.out.println("青キャップ状況：" + hyo);
		
		//全員の表示
		for(int i = 0; i <card.length; i++) {
			card[i].printInfo();
		}
		in.close();
	}

}
