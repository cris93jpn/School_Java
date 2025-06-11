
public class ShopSales extends Shop{
	int price;
	int clients;
	int sales;
	
	ShopSales(int sales_id, int moku, String name, int price, int clients) {
		super(sales_id, name, moku);
		this.price = price;
		this.clients = clients;
		this.sales = 0;
	}
	
	//売上を計算するメソッド
	void calcSales() {
		sales = price * clients;
	}
	
	//目標達成判定のメソッド
	String checkTar() {
		if (sales >= moku) {
			return "目標達成";
		} else {
			return "目標額に届かない";
		}
	}
	
	//情報表示
	void printInfo() {
		System.out.println("売り場ID: " + sales_id);
		System.out.println("売り場名: " + name);
		System.out.println("売上金額: " + sales);
		System.out.println("目標: " + moku);
		System.out.println("判定: " + checkTar());
	}

}
