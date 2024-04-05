public class TwoDArray {
  public static void main(String[] args) {
    int[][] matrix = new int[2][3];
    matrix[0][0] = 1;
    matrix[0][1] = 2;
    matrix[0][2] = 3;
    matrix[1][0] = 4;
    matrix[1][1] = 5;
    matrix[1][2] = 6;
    System.out.println("The elements of the 2D array are:");
    for (int i = 0; i < matrix.length; i++) { 
      for (int j = 0; j < matrix[i].length; j++) { 
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println(); 
    }
  }
}
