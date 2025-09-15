public class Calc {
	public static void main(String args[]) {
		if (args.length != 3) {
			System.out.println("Usage: calc <number_one> <operator> <number_two>");
			System.exit(1);
		}
		double a = 0, b = 0, result = 0;
		String op = "";
		try {
			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[2]);
			op = args[1];
		}
		catch (NumberFormatException e) {
			System.err.println("Error: Invalid number");
			System.exit(2);
		}
		catch (NullPointerException e) {
			System.err.println("Error: blank parameter");
			System.exit(3);
		}
		try {
			switch (op) {
				case "+": result = a + b; break;
				case "-": result = a - b; break;
				case "*": result = a * b; break;
				case "/": result = a / b; break;
				default: System.out.println("Invalid operator"); return;
			}
		}
		catch (ArithmeticException e) {
			System.err.println("Error: division by zero");
			System.exit(4);
		}
		System.out.println(result);
	}
}
