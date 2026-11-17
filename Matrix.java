import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        // Initialize Scanner
        Scanner sc = new Scanner(System.in);
        // Initialize Array
        int[][] arr = new int[3][3];
        char yn = 'y';
        //Do-while loop
        do {
            System.out.println("Input 9 elements");
            for (int c = 0; c<arr.length; c++) {
                for (int r = 0; r<arr[c].length; r++) {
                    arr[c][r] = sc.nextInt();
                 sc.nextLine();
               }
            }
            System.out.println();
            System.out.println("Display Here are the Numbers and the required outputs:");
            System.out.println("==============================================");

            // Display table and calculate row sums
            System.out.printf("%45s%n%n", "Row Sum");
            int[] rowSums = new int[3];
            int[] colSums = new int[3];
            int diagSum1 = 0;
            int diagSum2 = 0;

            for (int i = 0; i < 3; i++) {
                System.out.println("    ");
                for (int j = 0; j< 3;j++){
                    System.out.printf("%-8d", arr[i][j]);
                    rowSums[i] += arr[i][j];
                    colSums[j] += arr[i][j];

                    if (i == j) {
                    diagSum1 += arr[i][j];
                    }
                    if (i + j == 2) {
                        diagSum2 += arr[i][j];
                    }
                }
               System.out.printf("    %d%n", rowSums[i]);
            }
            
            // Print Colomn sums
            System.out.println();
            System.out.print("Column sum: ");
            for (int j = 0; j < 3; j++){
                System.out.printf("%-8d", colSums[j]);
            }
            System.out.println();
            System.out.println("=============================================");
            //Print Diagonal sums
            System.out.printf("Diagonal sum 1:     %d%n", diagSum1);
            System.out.printf("Diagonal Sum 2:     %d%n", diagSum2);
            System.out.println();
            //Prompt repeat

            System.out.print("Try Again [y|n]: ");
            yn = sc.next().charAt(0);
            System.out.println();
        } while (yn == 'y' || yn == 'Y');

        sc.close();
    }
}