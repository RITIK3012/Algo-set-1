public class ParallelogramPattern {
    public static void printParallelogram(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" "); 
            }
            for (int k = 0; k < columns; k++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        int rows = 3;
        int columns = 5; 
        printParallelogram(rows, columns);
    }
}
