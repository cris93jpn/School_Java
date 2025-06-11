import java.util.Scanner;

public class section_10 {
	//メインメソッド
	public static void main (String[] args) {
		//Scannerの準備
		Scanner in = new Scanner(System.in);
		//人数の入力
		System.out.println("人数を入学してください。");
		int per = in.nextInt();
		
		//クラス型配列の定義
		Student[] card = new Student[per];
		//コンストラクタの引数となるデータを入力
		for (int i = 0; i < per; i++) {
			System.out.println("学籍番号を入力してください。");
			int ban = in.nextInt();
			System.out.println("名前を入力してください。");
			String name = in.next();
			System.out.println("成績点を入力してください。");
			int sei = in.nextInt();
			//インスタンス生成
			card[i] = new Student (ban, name, sei);
		}
		
		//全体の成績の平均点を求めるメソッド呼び出し
		Student.avrg(card);
		//平均点以上の人数を求めるメソッド呼び出し
		Student.avr_up(card);
		//全員の情報を表示（メソッド呼び出し）
		for (int i = 0; i < per; i++) {
			card[i].PrintInfo();
		}
		//クラス変数の平均点表示
		System.out.println("成績の平均点：" + Student.avr);
		//クラス変数の人数表示
		System.out.println("平均点以上の人数：" + Student.cnt);
		in.close();
	}

}
