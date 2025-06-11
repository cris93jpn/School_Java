
public class VirtualBird extends VirtualPet {
	
	VirtualBird(String name, int maxEnergy, int energy) {
		super(name, maxEnergy, energy);
	}
	
	void fly() {
		if (this.energy < 10) {
			System.out.println(this.name + "：疲れちゃって、これ以上飛べないよ。");
		} else {
			System.out.println(this.name + "：パタパタ。飛んだよ。体力が10減った。最大体力が1増えた。");
			this.energy -= 10; //体力が10減る
			this.maxEnergy++;  //最大体力が1増える
		}
	}

}
