public class Program {
	public static void main(String[] args) {
		// 	************
		// 	** Arrays **
		// 	************
		int[] array1 = new int[3];
		array1[0] = 0;
		array1[1] = 1;
		array1[2] = 2;

		int[] array2 = { 0, 1, 2 };

		int[][] array3 = new int[2][2];
		array3[0][0] = 0;
		array3[0][1] = 1;
		array3[1][0] = 2;
		array3[1][1] = 3;

		int[][] array4 = { { 0, 1 }, { 2, 3 } };

		// 	***---- using for loop to iterate over array ----***
		for (int index = 0; index < array3.length; index++) {
			for (int jindex = 0; jindex < array3[index].length; jindex++) {
				System.out.println(array3[index][jindex]);
			}
		}

		System.out.println("\n-*-*-*-*-\n");

		//  ***---- using for-each loop to iterate over array ----***
		for (int[] line : array4) {
			for (int column : line) {
				System.out.println(column);
			}
		}
	}
}