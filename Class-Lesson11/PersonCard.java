/*
 * クラス定義
 * 11－クラス変数とクラスメソッド2
 */

public class PersonCard {
	//クラス変数staticをつける
	static int ban = 1000;
	static int blue = 0;
	
	//クラスメソッド
	public static String CountPer(PersonCard[] cards) {
		int n = cards.length;
		double wari = PersonCard.blue/n;
		
		String moji = "";
		if (wari > 0.4) {
			moji = "優秀";
		} else if (wari >= 0.3) {
			moji = "普通";
		} else {
			moji = "指導";
		}
		return moji;
	}
	
	//フィールド定義（インスタンス変数）
	int bango;
	String name;
	int grade;
	String color;
	int year;
	
	
	//コンストラクタ
		PersonCard(String name, int grade, int year) {
			this.bango = ban++;
			this.name = name;
			this.grade = grade;
			this.color = "";
			this.year = year;
			}
		
	//インスタンスメソッド: 個人情報の表示
	public void printInfo() {
		System.out.println("ーーーメンバー表示ーーー");
        System.out.println("会員番号: " + this.bango);
        System.out.println("名前: " + this.name);
        System.out.println("級: " + this.grade);
        System.out.println("キャップの色: " + this.color);
        System.out.println("学年: " + this.year);
    }
	
	//級の判定
	void ColorType() {
		switch (this.grade) {
		case 1: case 2:
			this.color = "青";
			PersonCard.blue++;
		case 3: case 4: case 5:
			this.color = "黄色";
			break;
		case 6: case 7: case 8:
			this.color = "赤";
		break;
			
		}
	}
	
	//6年生の人数カウント
	public int SixthGrade(PersonCard[] cards) {
		int cnt = 0;
		for (int i = 0; i <cards.length; i++) {
			if (cards[i].year == 6) {
				cnt++;
			}
		}
		return cnt;
	}

}
