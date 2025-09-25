class Program {
	public static double division(double a, double b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("It is not possible to divide by zero.");
		}

		return a / b;
	}

	public static void main(String... args) {
		try {
			System.out.println(division(42, 0));
		}

		// Specific exception
		catch(ArithmeticException exception) {
			exception.printStackTrace(System.out);
			System.out.println(exception);
		}

		// General exception
		catch(Exception exception) {
			System.out.println(exception);
		}
		finally {
			System.out.println("\nFinally Block: end of the program.");
		}
	}
}