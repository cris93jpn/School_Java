/*
 * クラス定義
 * 10－クラス変数とクラスメソッド１
 */


public class Student {
	//クラス変数staticをつける
	static int sum = 0;
	static int cnt = 0;
	static int avr = 0;
	
	//フィールド定義（インスタンス変数）
	int ban;
	String name;
	int sei;
	int rank;
	
	//①クラスメソッドstaticをつける
	static void avrg(Student[] tbl) {
		for (int i = 0; i < tbl.length; i++) {
			Student.sum+=tbl[i].sei;
		}
		Student.avr = Student.sum/tbl.length;
	}
	
	//②クラスメソッドstaticをつける
	static void avr_up(Student[] tbl) {
		for (int i = 0; i <tbl.length; i++) {
			if (tbl[i].sei >= Student.avr) {
				Student.cnt++;
			}
		}
	}
	
	//コンストラクタ
	Student (int bango, String na, int seiseki) {
		this.ban = bango;
		this.name = na;
		this.sei = seiseki;
		this.rank = 1;
	}
	
	//インスタンスメソッド１
	void PrintInfo() {
		System.out.println("学籍番号：" + this.ban);
		System.out.println("名前：" + this.name);
		System.out.println("成績点：" + this.sei);
		System.out.println("順位：" + this.rank);
	}
}
	

