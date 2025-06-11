
public class StudentCard {
	int id; //学籍番号
	String name; //氏名
	
	//コンストラクタ
	StudentCard(int n_id, String n_name) {
		this.id = n_id;
		this.name = n_name;
	}
	
	//表示
	void printInfo() {
		//スーパークラス
        System.out.println("学籍番号: " + this.id );
        System.out.println("氏名: " + this.name);
   }

}
