import  java.util.Scanner;

public class Section7_03 {
	public static String bunnyafun(int syono) {
		int f = (syono / 100) % 10;
		String mo;
		switch (f) {
		case 1:
			mo ="電気製品";
			break;
		case 2:
			mo = "日用雑貨";
			break;
		case 3:
			mo = "食品";
			break;
		case 4:
			mo = "衣類";
			break;
		default:
			mo = "1－4の中の番号を選んでください。";
		}
		return mo;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int syono;
		while(true) {
			System.out.print("商品番号を入力してください（1000～4999)：\n");
            syono = in.nextInt();
            if (syono >= 1000 && syono <= 4999) {
        		String bun = bunnyafun(syono);
        		System.out.println("商品番号 " + syono + " は " + bun + "の分類です。");
            	break;
            } else {
                System.out.println("エラー：商品番号は1000から4999の範囲で入力してください。");
            }
		}

        in.close();
		
	}

}
