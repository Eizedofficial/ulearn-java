public static int getNumbers(int a, int b) {
	int sum = a + b;
	int counter = 0;
	while (sum != 0) {
		int digit = sum % 10;
		if (digit % 2 == 0) {
			counter++;
		}
		sum /= 10;
	}
	return counter;
}
