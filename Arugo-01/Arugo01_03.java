//	キョウショウキョウ
//　入れ替えがありません
import java.util.Scanner;

public class Arugo01_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("単価と数量を入力してください。");
		int a = in.nextInt();
		int b = in.nextInt();
		double sum = (a + b) * 0.10;
		double ans = a + b + sum;
		System.out.println("税込は" + ans);
		in.close();
		
	}

}
