public class Diamondpattern {
    public static boolean printDiamond(int rows) {
        if (rows % 2 == 0) {
            System.out.println("Error: Number of rows must be odd.");
            return false;
        }

        int mid = rows / 2 + 1;
        for (int i = 1; i <= mid; i++) {
            for (int j = 1; j <= mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = mid - 1; i >= 1; i--) {
            for (int j = 1; j <= mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return true;
    }

    public static void main(String[] args) {
        int rows = 9;
        if (printDiamond(rows)) {
            System.out.println("Diamond pattern printed successfully.");
        }
    }
}
