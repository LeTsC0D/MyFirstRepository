public class MaximizingTheProduct {
	public static void main(String args[]) {
		int[] listOfNumbers = {2,2,3,4};
		for (int count = 0; count < listOfNumbers.length ; count++) {
			for (int count1 = 0; count1 < listOfNumbers.length ; count1++) {
				if (listOfNumbers[count] < listOfNumbers[count1]) {
					int number = listOfNumbers[count];
					listOfNumbers[count] = listOfNumbers[count1];
					listOfNumbers[count1] = number;
				}
			}
		} 
		listOfNumbers[0] = listOfNumbers[0] + 1;
		int product = 1;
		for(int a : listOfNumbers ) {
			product *= a;
		} 
		System.out.println(product);
	}
}
