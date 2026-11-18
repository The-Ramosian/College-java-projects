import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        // Initialize Scanner
        Scanner sc = new Scanner(System.in);
        // Initialize Array
        int[][] arr = new int[3][3];
        char yn = 'y';
        
        // Do-while loop
        do {
            System.out.println("Input 9 elements:");
            for (int c = 0; c < arr.length; c++) {
                for (int r = 0; r < arr[c].length; r++) {
                    arr[c][r] = sc.nextInt();
                }
            }
            
            System.out.println();
            System.out.println("Display Here are the Numbers and the required outputs:");
            System.out.println("======================================================");

            // Initialize sums
            int[] rowSums = new int[3];
            int[] colSums = new int[3];
            int diagSum1 = 0;
            int diagSum2 = 0;

            // Calculate all sums
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    rowSums[i] += arr[i][j];
                    colSums[j] += arr[i][j];

                    if (i == j) {
                        diagSum1 += arr[i][j];
                    }
                    if (i + j == 2) {
                        diagSum2 += arr[i][j];
                    }
                }
            }

            // Print table headers
            System.out.printf("%41s%12s%n%n", "Row Sum", "Col Sum");

            // Print matrix elements, Row Sum, and Column Sum side-by-side
            for (int i = 0; i < 3; i++) {
                System.out.print("            ");
                for (int j = 0; j < 3; j++) {
                    System.out.printf("%-8d", arr[i][j]);
                }
                // Print row sum and column sum side by side for row i
                System.out.printf("    %d        %d%n", rowSums[i], colSums[i]);
            }
            
            System.out.println("=====================================================");

            // Print Diagonal sums
            System.out.printf("Diagonal sum 1:     %d%n", diagSum1);
            System.out.printf("Diagonal Sum 2:     %d%n", diagSum2);

            System.out.println();
            // Prompt repeat
            System.out.print("Try Again [y|n]: ");
            yn = sc.next().charAt(0);
            System.out.println();
        } while (yn == 'y' || yn == 'Y');

        // Close scanner
        sc.close();
    }
}
