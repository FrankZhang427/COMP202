public class Warmup {
	// Warm-up 1
	public static void swap (int x, int y) {
		// before swap
		System.out.println("inside swap: x is:" + x + " y is:" + y);
		// swap two numbers using temporary variable
		int tmp = y;
		y = x;
		x = tmp;
		// after swap
		System.out.println("inside swap: x is:" + x + " y is:" + y);
	}

	// Warm-up 3
	public static boolean check(int x, int y, int z) {
		if ( z == 3 || z == x + y ) {
			return true;
		}
		else {
			return false;
		}
	}

	// Warm-up 4
	public static int getRandomNumber(int min, int max) {
		// part 1
   		// return Math.random() * 10;
   		// part 2
   		// return (int)(Math.random() * 10);
   		// part 3
   		int range = (max - min);
   		return (int)(Math.random() * range) + min;
	}


	public static void main(String[] args) {
		// numbers to swap
		int x = 3;
		int y = 4;
		int z = 4;
		switch (args[0]) {
			case "1" : 
				System.out.println("outside swap: x is:" + x + " y is:" + y);
				swap(x,y);
				System.out.println("outside swap: x is:" + x + " y is:" + y);
				break;
			case "3" :
				System.out.println("x:" + x + " y:" + y + " z:" + z);
				boolean result = check(x, y, z);
				System.out.println("result of check is " + result);
				break;
			case "4" :
				System.out.println("get 10 random numbers in range 4 and 11");
				for (int i = 0; i < 10; i++) {
					System.out.println("random number is : " + getRandomNumber(4, 11));
				}
				break;
		}


	}
}