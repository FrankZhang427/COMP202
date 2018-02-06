public class Counting {
	public static void main(String[] args) {
		if (args.length == 1) {
			int max = 0;
			try {
				max = Integer.parseInt(args[0]);
				if (max <= 0) {
					System.err.println("usage : arguments must be a positive number");
					System.exit(-1);
				}
			}
			catch (NumberFormatException nfe) {
				System.err.println("usage : arguments in wrong format, an interger input is required");
				System.exit(-1);
			}
			System.out.print("I am counting until " + max + ": ");
			for (int i = 1; i <= max ; i++ ) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		else if (args.length == 2) {
			int max = 0;
			int step = 0;
			try {
				max = Integer.parseInt(args[0]);
				step = Integer.parseInt(args[1]);
				if (max <= 0 || step <= 0) {
					System.err.println("usage : arguments must be a positive number");
					System.exit(-1);
				}
			}
			catch (NumberFormatException nfe) {
				System.err.println("usage : arguments in wrong format, an interger input is required");
				System.exit(-1);
			}
			System.out.println("I am counting to " + max + " with a step size of " + step + ":");
			for (int i = 1; i <= max ; i+=step ) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		else {
			System.err.println("usage : Counting [max value] [step size]");
		}
	}
}