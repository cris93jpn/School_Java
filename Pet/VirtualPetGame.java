
public class VirtualPetGame {
	public static void main(String[] args) {
		//情報	
		VirtualDog taro = new VirtualDog("タロ", 100, 50);
		VirtualBird piyo = new VirtualBird("ピヨ", 60, 30);
		VirtualCat momo = new VirtualCat("もも", 90, 40);
		
		//クラス呼び出し
		taro.walk();
		piyo.fly();
		momo.walk();
		
		//表示
		taro.printInfo();
		piyo.printInfo();
		momo.printInfo();
	}

}
