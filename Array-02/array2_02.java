/*
 * べき乗のメソッド
 * Math.Pow（値,n乗）
 * 例　2の4乗
 * A=Math.Pow(2,4)
 * Aは16
 * 
 * 2次元配列例題2
 */

import java.util.Scanner;

public class array2_02 {
	public static void main(String[] args) {
		//Scannerの準備
		Scanner in = new Scanner(System.in);
		System.out.println("行数を入力してください。");
		int h = in.nextInt();
		System.out.println("列数を入力してください。");
		int v = in.nextInt();
		//二次元配列の定義
		int[][] Atbl= new int[h][v];
		//行の操返し
		for (int i=0; i<Atbl.length;i++) {
			int val= 1; //初期代入の１
			//列の操返し
			for(int j=0; j<Atbl[i].length;j++) {
				//べき乗計算のメソッド
				Atbl[i][j] = (int) Math.pow(val, i+1);
				val++;
				
			}
		}
		//表示
		for (int i=0; i<Atbl.length; i++) {
			for (int j=0; j<Atbl[i].length; j++) {
				System.out.print(Atbl[i][j] + " ");
			}
			System.out.println();
		}
		in.close();
	}

}
