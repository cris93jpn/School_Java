import java.util.Scanner;

public class Section7_02 {
	public static int uriagefun(int TBL[], int kingaku) {
		int sum = 0;
		for (int amo :TBL) {
			sum+= amo;
		}
		System.out.println("合計額は" + sum + "です。");
		return (sum*100)/kingaku;
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] ju = new int[6];
		System.out.println("6月分の売上を入力してください");
		for (int i = 0; i < 6; i++) {
			System.out.print((i+1) + "月目の売上：");
			ju[i] = in.nextInt();
		}
		
		System.out.println("目標金額を入力してください");
		int mo = in.nextInt();
		int ta = uriagefun(ju, mo);
		System.out.println("達成率は" + ta + "％です。");
		if (ta > 100) {
			System.out.println("目標達成！");
		} else if (ta > 80 && ta <=100) {
			System.out.println("もう少しですね");
		} else {
			System.out.println("後半に頑張りましょう");
		}
		
		in.close();
	}

}
