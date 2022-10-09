package BaiTap;

public class StarTotalColumn {
    public static void main(String[] args) {
        int[][] matrix = new int[10][11];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + "\t");
            }
            System.out.println();
        }
        int total = 0;
        int index = 0;
        for (int column = 0; column < matrix[index].length; column++) {
            for (int row = 0; row < matrix.length; row++){
                total += matrix[row][column];
            }
            System.out.println("Total Column " + (column + 1) + ":" + total);
            total = 0;
            index++;
        }

    }
}
