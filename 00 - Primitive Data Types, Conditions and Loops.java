import java.util.Scanner;

public class Program {
	public static void main(String... args) { // String[] args ~ String... args - are identical
		// 	****************
		// 	** Data Types **
		// 	****************
		byte integer1 = 1; // 8 bytes (2^8 / 2 = -128 ~ 127)
		short integer2 = (short) integer1; // 16 bytes
		int integer3 = (int) integer2;   // 32 bytes
		long integer4 = 4L; // 64 bytes - can use either 'L' or 'l'

		int formattedNumber1 = 1_000_000_000;
		int formattedNumber2 = 0b1111_1111; // binary
		int formattedNumber3 = 0xFF_FF;     // hex

		float decimal1 = 0.50F; // 32 bytes - can use either 'F' or 'f' - seven decimal digits, less precise, less memory usage, faster calculations compared to double
		double decimal2 = 0.50; // 64 bytes - twelve decimal digits, more precise, more memory usage, slower calculations compared to float

		boolean bool1 = true;
		boolean bool2 = false;

		char letter = 'F';
		String name = "Felix";

		System.out.println("Byte Size: " + Byte.SIZE + " bytes");
		System.out.println("Short Size: " + Short.SIZE + " bytes");
		System.out.println("Integer Size: " + Integer.SIZE + " bytes");
		System.out.println("Long Size: " + Long.SIZE + " bytes");
    System.out.println("\n-*-*-*-\n");

		System.out.println("Float Size: " + Float.SIZE + " bytes");
		System.out.println("Double Size: " + Double.SIZE + " bytes");
    System.out.println("\n-*-*-*-\n");
        
		System.out.println("Boolean Size: 1 byte");
		System.out.println("Character Size: " + Character.SIZE + " bytes");

		// 	*************
		// 	** Scanner **
		// 	*************
		Scanner scanner = new Scanner(System.in);
		
		byte scNumber1 = scanner.nextByte();
		short scNumber2 = scanner.nextShort();
		int scNumber3 = scanner.nextInt();
		long scNumber4 = scanner.nextLong();

		float scDecimal1 = scanner.nextFloat();
		double scDecimal2 = scanner.nextDouble();

		boolean scBoolean = scanner.nextBoolean();

		char scLetter = scanner.next().charAt(0);
		String scWord = scanner.next();
		String scLine = scanner.nextLine();

		System.out.println("scNumber1 " + scNumber1);
		System.out.println("scNumber2 " + scNumber2);
		System.out.println("scNumber3 " + scNumber3);
		System.out.println("scNumber4 " + scNumber4);
		System.out.println("\n-*-*-*-*-\n");

		System.out.println("scDecimal1 " + scDecimal1);
		System.out.println("scDecimal2 " + scDecimal2);
		System.out.println("\n-*-*-*-*-\n");

		System.out.println("scBoolean " + scBoolean);
		System.out.println("\n-*-*-*-*-\n");

		System.out.println("scLetter " + scLetter);
		System.out.println("scWord " + scWord);
		System.out.println("scLine " + scLine);

		// 	**************************
		// 	** Conditions and Loops **
		// 	**************************

		// 	***---- if-else condition ----***
		int age = 25;

		if (age < 0) {
			System.out.println("Invalid Age!");
		}
		else if (age < 18) {
			System.out.println("Too young!");
		}
		else {
			System.out.println("OK!");
		}

		//  ***---- switch-case-default condition ----***
		int day = 2;

		switch (day) {
			case 0:
				System.out.println("Sunday!");
				break;

			case 1:
				System.out.println("Monday!");
				break;

			default:
				System.out.println("Not Sunday nor Monday!");
		}

		// 	***---- while loop ----***
		int x1 = 0;
		int sum1 = 0;

		while (x1 > 3) {
			sum1 += x1;
			x1++;
		}

		System.out.println("- Sum: " + sum1); // output: 3

		//  ***---- do-while loop ----***
		int x2 = 0;
		int sum2 = 0;

		do {
			sum2 += x2;
			x2++;
		} while (x2 < 3);

		System.out.println("- Sum: " + sum2); // output: 6

		// 	***---- for loop ----***
		int sum3 = 0;

		for (int x = 0; x < 3; x++) {
			sum3 += x;
		}

		System.out.println("- Sum: ", x); // output: 3

		//  ***---- for-each loop ----***
		int[] array = { 0, 1, 2, 3, 4 };
		int sum4 = 0;

		for (int number : array) {
			sum4 += number;
		}

		System.out.println("- Sum: " + sum4);

		//	***---- break-continue loop ----***
		for (int x = 0; x < 10; x++) {
			if (x == 3) {
				continue;
			}

			if (x == 7) {
				break;
			}

			System.out.println(x);
		}
	}
}