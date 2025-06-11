import java.util.Scanner;

public class ClassMethod02_01 {
    public static void main(String[] args) {
        // キーボードから入力の為の準備
        Scanner in = new Scanner(System.in);
        // クラス型配列の定義5人分
        BankAccount[] card = new BankAccount[5];

        // 5人のアカウント
        card[0] = new BankAccount("Takahashi", 5000, 1234);
        card[1] = new BankAccount("Suzuki", 6000, 2345);
        card[2] = new BankAccount("Miura", 10000, 3456);
        card[3] = new BankAccount("Hori", 15000, 4567);
        card[4] = new BankAccount("Mori", 9000, 5678);

        // メニューを表示
        while (true) {
            System.out.println("処理番号を入力してください:");
            System.out.println("1: 新規登録 2: 入金処理 3: 出金処理 4: 預金額表示 それ以外で終了");
            int bango = in.nextInt();

            switch (bango) {
                case 1:
                    // 新規登録を作る
                    System.out.println("名前を入力してください。ー＞");
                    String na = in.next();
                    System.out.println("初期預金額を入力してください。ー＞");
                    int kin = in.nextInt();
                    System.out.println("パスワード（4桁）を入力してください：");
                    int password = in.nextInt();

                    // 新しいアカウントを作る場所
                    boolean accCreate = false;
                    for (int i = 0; i < card.length; i++) {
                        if (card[i] == null) {
                            card[i] = new BankAccount(na, kin, password);
                            System.out.println("新規口座が開設されました。口座番号:" + card[i].account);
                            accCreate = true;
                            break;
                        }
                    }

                    if (!accCreate) {
                        System.out.println("登録できる空きアカウントがありません。");
                    }
                    break;

                case 2:
                    // 入金処理を行う
                    System.out.println("口座番号を入力してください。ー＞");
                    int acc = in.nextInt();
                    System.out.println("パスワードを入力してください。ー＞");
                    int pass = in.nextInt();
                    System.out.println("入金額を入力してください。ー＞");
                    int money = in.nextInt();

                    // アカウントがあるかどうかを確認
                    boolean accf = false;
                    for (int i = 0; i < card.length; i++) {
                        if (card[i] != null && card[i].account == acc) {
                            // アカウントがあったら、お金を入れる
                            card[i].AddMoney(money, pass);
                            accf = true;
                            break;
                        }
                    }

                    if (!accf) {
                        System.out.println("アカウントは見つかりませんでした。");
                    }
                    break;

                case 3:
                    // 出金処理
                    System.out.println("口座番号を入力してください。ー＞");
                    int wacc = in.nextInt();
                    System.out.println("パスワードを入力してください。ー＞");
                    int wpass = in.nextInt();
                    System.out.println("出金額を入力してください。ー＞");
                    int wmoney = in.nextInt();

                    // アカウントがあるかどうかを確認
                    boolean accf2 = false;
                    for (int i = 0; i < card.length; i++) {
                        if (card[i] != null && card[i].account == wacc) {
                            // アカウントがあったら、出金
                            card[i].withdrawMoney(wmoney, wpass);
                            accf2 = true;
                            break;
                        }
                    }

                    if (!accf2) {
                        System.out.println("アカウントは見つかりませんでした。");
                    }
                    break;

                case 4:
                    // 預金額表示
                    System.out.println("口座番号を入力してください。ー＞");
                    int cacc = in.nextInt();
                    System.out.println("パスワードを入力してください。ー＞");
                    int cpass = in.nextInt();

                    // アカウントがあるかどうかを確認
                    boolean accf3 = false;
                    for (int i = 0; i < card.length; i++) {
                        if (card[i] != null && card[i].account == cacc) {
                            // アカウントがあったら、残高表示
                            card[i].checkBalance(cpass);
                            accf3 = true;
                            break;
                        }
                    }

                    if (!accf3) {
                        System.out.println("アカウントは見つかりませんでした。");
                    }
                    break;

                default:
                    System.out.println("プログラム終了");
                    in.close();
                    return;  // Exit the program
            }
        }
    }
}