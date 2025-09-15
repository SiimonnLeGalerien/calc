import java.lang.Math;

public class Calc {
	public static void main(String args[]) {
		if (args.length != 3 && args.length != 2) {
			System.out.println("Usage: calc <number_one> <operator> <number_two>");
			System.out.println("       calc <operator> <number>");
			System.exit(1);
		}
		double result = 0;
		if (args.length == 3) {
			double a = 0, b = 0;
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
					case "%": result = a % b; break;
					case "pow": result = Math.pow(a, b); break;
					case "//": result = (double) Math.floorDiv((int) a,(int) b); break;
					default: System.out.println("Invalid operator"); return;
				}
			}
			catch (ArithmeticException e) {
				System.err.println(e.getMessage());
				System.exit(4);
			}
		}
		else {
			double a = 0;
			String op = "";

			try {
				a = Double.parseDouble(args[1]);
				op = args[0];
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
					case "abs": result = Math.abs(a); break;
					case "acos": result = Math.acos(a); break;
					case "asin": result = Math.asin(a); break;
					case "atan": result = Math.atan(a); break;
					case "cbrt": result = Math.cbrt(a); break;
					case "cos": result = Math.cos(a); break;
					case "exp": result = Math.exp(a); break;
					case "log": result = Math.log(a); break;
					case "log10": result = Math.log10(a); break;
					case "sin": result = Math.sin(a); break;
					case "sqrt": result = Math.sqrt(a); break;
					case "tan": result = Math.tan(a); break;
					default: System.out.println("Invalid operator"); return;
				}
			}
			catch (ArithmeticException e) {
				System.err.println(e.getMessage());
				System.exit(4);
			}
		}
		System.out.println(result);
	}
}
