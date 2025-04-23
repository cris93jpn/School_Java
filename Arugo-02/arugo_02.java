
public class arugo_02 {
	public static void main(String[] args) {

		int x = 5;
		int y = 2;
		int max;
		int min;
		max = 0;
		min = 0;
			if (x > y) {
			 max = x;
			 min = y;
		} else {
			max = y;
			min = x;
		}
			System.out.println("MAX:" + max);
			System.out.println("MIN:" + min);
	}

}
