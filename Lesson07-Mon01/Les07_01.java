import java.util.Scanner;


public class Les07_01 {
	public static void main(String[] args) {
		//Scannerの準備
		Scanner in = new Scanner(System.in);
		//キーボードから入力
		System.out.println("学科を入力してください。");
		String ga = in.next();
		System.out.println("学籍番号を入力してください。");
		int ban = in.nextInt();
		System.out.println("名前を入力してください。");
		String na = in.next();
		System.out.println("国籍を入力してください。");
		String nat = in.next();
		
		//サブクラスのインスタンス生成
		Itstudent stu = new Itstudent(ban, na, ga, nat);
		
		//表示
		stu.infoPrint();
		in.close();
	}
}
