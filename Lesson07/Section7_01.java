import java.util.Scanner;


public class Section7_01 {
	static public String printfun(int ten) {
		switch(ten) {
		case 1:
			return "良く出来ました。";
		case 2:
			return "もう少し頑張りましょう。";
		case 3:
			return "不合格です。";
		default:
			return "値は無い";
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Pythonの点数を入力してください");
		int py = in.nextInt();
		System.out.println("Javanの点数を入力してください");
		int ja = in.nextInt();
		int tens;
		if (py > 60 && ja > 60) {
			tens = 1;
		} else if (py > 60 || ja > 60) {
			tens = 2;
		} else {
			tens = 3;
		}
		String result = printfun(tens);
		System.out.println(result);
		in.close();
	}
	

}
