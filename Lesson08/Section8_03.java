import java.util.Scanner;

public class Section8_03 {
	
	public static String get(int num) {
        int catind = (num / 1000) - 1;
        String[] cat = {"文房具", "衣類", "電化製品", "家具"};
        int[] prices = {500, 2500, 5000, 15000};
        
        if (catind >= 0 && catind < cat.length) {
            System.out.println(cat[catind]);
            return String.valueOf(prices[catind]); 
        }
        return null; 
    }
	
	public static boolean check(int num) {
		return num < 1000 && num > 4999;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
            System.out.println("商品番号を入力してください（9999で終了）:");
            int num = in.nextInt();
            if (num == 9999) {
            	System.out.println("プログラムを終了します。");
                break;
            }
            while(check(num)) {
            	System.out.println("エラー: 商品番号は1000～4999の範囲で入力してください:");
                num = in.nextInt();
            }
            
            String categ = get(num);
            int price = Integer.parseInt(categ);
            
            System.out.println("数量を入力してください:");
            int suu = in.nextInt();
            
            int sum = price * suu;
            
            System.out.println("商品番号: "+ num +", 商品分類名: " + categ +", 単価:" + price +"円, 数量: " + suu +", 金額: " + sum +"円\n");
            
		}
		in.close();
	}

}
