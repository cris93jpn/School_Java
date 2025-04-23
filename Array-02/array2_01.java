/*
 * 2次元配列例題１
 */

public class array2_01 {
	public static void main(String[] args) {
		//2次元配列の初期化
		int[][] Atbl = {
				{10, 20, 30, 40},
				{50, 60, 70, 80},
				{90, 10, 11, 12}
		};
		//1次元配列の定義
		int[] Ctbl = new int [20];
		//配列の値を代入
		int x=0;
		for (int i=0; i<Atbl.length;i++) {
			for (int j=0; j<Atbl[i].length; j++) {
				Ctbl[x] = Atbl[i][j];
				x++;
			}
		} 
		//Ctbl表示
		for(int i=0; i<12; i++) {
			//横一列に表示
			System.out.print(Ctbl[i] + " ");
		} 
	}
}
