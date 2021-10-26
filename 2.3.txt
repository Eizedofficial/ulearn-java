public static String getRevertString(String str) {
	StringBuilder mod_str = new StringBuilder(str).reverse();
	char firstChar = mod_str.charAt(0);
	mod_str.deleteCharAt(0);
	return Character.toUpperCase(firstChar) + mod_str.toString().toLowerCase();
}
