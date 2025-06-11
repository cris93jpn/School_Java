import java.util.Scanner;


public class Section8_01 {
	public static int max(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int[] hei = new int[3];
		int[] we = new int[3];
		int[] age = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println( (i + 1) + "人の身長を入力してください。");
			hei[i] = in.nextInt();
			System.out.println((i + 1) + "人の体重を入力してください。");
			we[i] = in.nextInt();
			System.out.println((i + 1) + "人の年齢を入力してください。");
			age[i] = in.nextInt();
		}
		
		int maxhei = max(hei[0], hei[1], hei[2]);
		int maxwe = max(we[0], we[1], we[2]);
		int maxage = max(age[0], age[1], age[2]);
		
		System.out.println("身長の最大は" + maxhei);
		System.out.println("体重の最大は" + maxwe);
		System.out.println("年齢の最大は" + maxage);
		in.close();
	}

}
