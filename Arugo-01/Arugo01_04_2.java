import java.util.Scanner;

public class Arugo01_04_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("身長と体重を入力してください。");
		double alt = in.nextDouble();
		double wei = in.nextDouble();
		System.out.println("身長は" + alt);
		System.out.println("体重は" + wei);
		double alt2 = (double)alt/1000;
		double wei2 = (double)wei/1000;
		double bmi2 = wei2 / (alt2 * alt2);
		double a = (alt2 * alt2) * 22;
		System.out.println("BMIは" + bmi2);
		System.out.println("標準体重は" + a);
		in.close();
		
	}

}
