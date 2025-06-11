import java.util.Scanner;

public class Section8_02 {
	
	public static int[] array(int mult) {
		int[] TBL = new int[10];
		for (int i = 0; i < TBL.length; i++) {
			TBL[i] = mult * (int) Math.pow(2, i);
		}
		return TBL;
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("値を入力してください。");
		int val = in.nextInt();
		
		int[] ans = array(val);
		
		System.out.print("TBLの値は ");
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	
		in.close();
	}

}
