public class HalfDiamondPattern {
    public static void printHalfDiamond(int columns) {
        for (int i = 1; i <= columns; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = columns - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int columns = 5;
        printHalfDiamond(columns);
    }
}
