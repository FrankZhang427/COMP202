public class LemonadeStand {
	
	public static void printTotalSales(int numSales, double price) {
		System.out.println("We sold " + numSales + " units at $" + price + " each, which totals $" + (price * numSales) + ".");
	}

	public static int divide(int a, int b) {
		if (b == 0) {
			System.out.println("Division by zero!");
			return 0;
		}
		else return a / b;
	}

	public static int getMaximum(int a, int b) {
		return (a > b)? a : b;
	}

	public static void standStats(int numDays, int numSales, double price) {
		printTotalSales(numSales, price);
		int salesPerDay = divide(numSales, numDays);
		System.out.println("With " + numSales + " sales over " + numDays + " days, the sales per day were " + salesPerDay + ".");
		int targetSales = getMaximum(salesPerDay, 10);
		System.out.println("The target sales are now: " + targetSales);
	}


}