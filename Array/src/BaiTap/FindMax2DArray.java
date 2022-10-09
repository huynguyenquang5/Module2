package BaiTap;

public class FindMax2DArray {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int max = matrix[0][0];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
                if (matrix[row][column] > max){
                    max = matrix[row][column];
                }
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Max = " + max);
    }
}
