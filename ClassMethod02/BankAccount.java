
public class BankAccount {
	
	//インスタンス変数
	static int cnt = 21000;
	String name;
	int kin;
	int password;
	int account;
	
	
	//コンストラクタ
	BankAccount(String na, int kin, int pass) {
		this.name = na;
		this.account = cnt++;
		this.kin = kin;
		this.password = pass;
	}
	
	
	//入金処理を行うメソッド
	void AddMoney(int money, int pw) {
		if (this.password == pw) {
			this.kin += money;
			System.out.println("入金が完了しました。新しい残高は: " + this.kin);
		} else {
            System.out.println("パスワードが間違っています。");
        }
	}
	
	//出金処理のメソッド
	void withdrawMoney(int money, int pw) {
		if (this.password == pw) {
            if (this.kin >= money) {
                this.kin -= money;
                System.out.println("出金が完了しました。残高は: " + this.kin);
            } else {
                System.out.println("残高が足りません。");
            }
        } else {
            System.out.println("パスワードが間違っています。");
        }
	}
	
	//アカウントの預金額を確認する
    void checkBalance(int pw) {
        if (this.password == pw) {
            System.out.println("現在の残高は: " + this.kin);
        } else {
            System.out.println("パスワードが間違っています。");
        }
    }
    
    //アカウント情報をプリント
    void printAccountInfo() {
        System.out.println("口座番号: " + this.account);
        System.out.println("名前: " + this.name);
        System.out.println("現在の残高: " + this.kin);
    }
	
}
