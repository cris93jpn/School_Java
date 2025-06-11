
public class Itstudent extends StudentCard{
	String gak; //学科名
	String nat; //国籍
	
	//コンストラクタ
	Itstudent(int n_id, String n_name, String n_gak, String n_nat) {
		super(n_id, n_name);
		this.gak = n_gak;
		this.nat = n_nat;
	}
	
	void infoPrint() {
		super.printInfo(); // スーパークラスのprintInfo
		System.out.println("学科名：" + this.gak);
		System.out.println("国籍：" + this.nat);
	}
}
