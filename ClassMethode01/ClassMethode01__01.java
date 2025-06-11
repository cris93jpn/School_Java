import java.util.Scanner;

public class ClassMethode01__01 {
	public static void main (String[] args) {
		//キーボードから入力の為の準備
		Scanner in = new Scanner(System.in);
		//クラス型配列の定義20人分	
		ClassMethod[] card = new ClassMethod[5];
		
		//20人のデータをインスタンス生成する　（配列に）
		for (int i = 0; i < 5; i++) {
			System.out.println("学生" + (i + 1) + "の情報を入力してください。");
			System.out.println("名前を入力してください。ー＞");
			String na = in.next();
			System.out.println("学校番号を入力してください（小学校＝1：中学高＝2：高校＝３) ー＞" );
			int bango = in.nextInt();
			System.out.println("学年を入力してください。ー＞");
			int nen = in.nextInt();
			System.out.println();
			
			card[i] = new ClassMethod(na, bango, nen);
		}
		
		//20人分の個人情報の表示する
		System.out.println("--------学生情報--------");
		for (int i = 0; i < 5; i++) {
			card[i].printMethod();
		}
		
		// 学校ごとの人数
        int[] counts = ClassMethod.school(card);
        System.out.println("------学校ごとの人数---------");
        System.out.println("小学生：" + counts[0]);
        System.out.println("中学生：" + counts[1]);
        System.out.println("高校生：" + counts[2]);
        
        int total = counts[0] + counts[1] + counts[2]; // 総人数を計算
		
        //中学生の％
		System.out.println("-----中学校の人数の％-----");
		ClassMethod.average(counts[1], total);
		
		
		
		in.close();
	}
}
