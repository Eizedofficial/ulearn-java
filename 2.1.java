public static float calculate(int a, int b, String operation) {
	switch (operation) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			if (b != 0)
				return (float) a / (float) b;
			else return 0;
		case "%":
			if (b != 0)
				return a % b;
			else return  0;
		default:
			return 0;
	}
}

public static String getMinimalType(String input) {
	long num = Long.parseLong(input);
	if (num <= Byte.MAX_VALUE && num >= Byte.MIN_VALUE)
		return ("Byte");
	else if (num <= Short.MAX_VALUE && num >= Short.MIN_VALUE)
		return ("Short");
	else if (num <= Integer.MAX_VALUE && num >= Integer.MIN_VALUE)
		return ("Int");
	else
		return ("Long");
}
