public static char[][] getTwoDimensionalArray(int size) {
        char[][] output = new char[size][size];
        for (char[] row : output)
            Arrays.fill(row, ' ');

        for (int i = 0; i < size; i++) {
            output[i][i] = 'X';
            output[i][size - i - 1] = 'X';
        }

        return output;
    }

    public static String getStringArray(char[][] charArray) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < charArray[0].length; i++) {
            output.append(charArray[i]).append("\n");
        }

        return output.toString();
    }
