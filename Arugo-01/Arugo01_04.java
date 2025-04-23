import java.util.Scanner;

public class Arugo01_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("高さと底辺を入力してください。");
		double T = in.nextDouble();
		double D = in.nextDouble();
		double s1 = D;
		double s2 = T;
		double s3 = s1 * s2;
		double s4 = s3 * 1/2;
		double M = s4;
		System.out.println("面積は" + M);
		in.close();
	}

}
