import java.util.Scanner;

public class Les07_02 {
	public static void main(String[] args) {
		//Scannerの準備
		Scanner in = new Scanner(System.in);
		ShopSales[] shops = new ShopSales[3];
		
		//情報を入力
		for (int i = 0; i < 3; i++) {
			System.out.println("売り場IDを入力してください→");
			int id = in.nextInt();
			System.out.println("売り場名を入力してください→");
			String na = in.next();
			System.out.println("目標額を入力してください→");
			int m = in.nextInt();
			System.out.println("商品単価を入力してください→");
			int ne = in.nextInt();
			System.out.println("来客数を入力してください→");
			int cust = in.nextInt();
			System.out.println();
			
			//arrayに入れる
			shops[i] = new ShopSales(id, m, na, ne, cust);
			//メソッド呼び出し
			shops[i].calcSales();
		}
		
		//情報を表示する
		System.out.println("----売上----");
		for (int i = 0; i < shops.length; i++) {
			shops[i].printInfo();
			System.out.println();
		}
		in.close();
	}

}
