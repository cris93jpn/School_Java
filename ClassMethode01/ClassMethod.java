
public class ClassMethod {
	//インスタンス変数
		String name;
		int ban;
		int school;
		int nen;
		String mo;
		
		static int cnt = 1000;
		
		//コンストラクタ
		ClassMethod (String na, int sc, int nen) {
			this.name = na;
			this.school = sc;
			this.nen = nen;
			this.ban = cnt++;
			
			switch (sc) {
			case 1:
				mo = "小学校";
				break;
			case 2:
				mo = "中学校";
				break;
			case 3: 
				mo = "高校";
				break;
			default:
				mo = "不明";
			}
			
		}
		
		//インスタンスメソッドフィールドの表示
			void printMethod() {
				System.out.println("会員番号：" + this.ban);
				System.out.println("名前：" + this.name);
				System.out.println("氏名学校番号：" + mo);
				System.out.println("学年：" + this.nen);
				System.out.println();
			}
			
			//学校ごとの人数をカウント
			static int[] school(ClassMethod[] students) {
				int sho = 0;
				int chu = 0;
				int ko = 0;
				
				for(int i = 0; i < 5; i++) {
					if (students[i].school == 1) {
						sho++;
					} else if (students[i].school == 2) {
						chu++;
					} else if (students[i].school == 3) {
						ko++;
					}
				}
				return new int[] {sho, chu, ko};
				}
			
			//中学生の人数の％求める
			static void average(int chu, int tot) {
		        if (tot == 0) {
		            System.out.println("登録者がいません。");
		        } else {
		            int av = (chu * 100) / tot;
		            
		            System.out.println("中学生の人数の％は：" + av + "%");
		        }
		    }
}
