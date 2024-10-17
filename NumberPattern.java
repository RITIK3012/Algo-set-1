public class Numberpattern {
    public static void printPattern(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) { // Odd rows
                for (int j = 1; j <= columns; j++) {
                    System.out.print(j);
                }
            } else { // Even rows
                for (int j = columns; j >= 1; j--) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        printPattern(rows, columns);
    }
}
