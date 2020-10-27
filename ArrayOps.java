public class ArrayOps{
  public static int sum(int[] arr){
    int rowTotal = 0;
    for (int i = 0; i < arr.length; i++){
      rowTotal += arr[i];
    }
    return rowTotal;
  }
  public static int largest(int[] arr){
    int biggest = 0;
    for (int i = 0; i < arr.length; i++){
      for (int j = i+1; j < arr.length; j++){
        if (arr[i] == arr[j]) biggest = arr[i];
        if (arr[i] < arr[j]) biggest = arr[j];
        if (arr[i] > arr[j]){
          biggest = arr[i];
          arr[i] = arr[j];
          arr[j] = biggest;
        }
      }
    }
    return arr[arr.length-1];
  }
  public static int[] sumRows(int[][] matrix){
    int[] allRows = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++){
      int total = 0;
      total += ArrayOps.sum(matrix[i]);
      allRows[i] = total;
    }
    return allRows;
  }
  public static int[] largestInRows(int[][] matrix){
    int[] result = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++){
      int total = 0;
      total += ArrayOps.largest(matrix[i]);
      result[i] = total;
    }
    return result;
  }
  public static int sum(int[][] arr){
    int entireArr = 0;
    for (int i = 0; i < arr.length; i++){
      for (int j = 0; j < arr[i].length; j++){
        entireArr += arr[i][j];
      }
    }
    return entireArr;
  }
  public static int[] sumCols(int[][] matrix) {
    int[] allCols = new int[matrix[0].length];
    for(int i = 0; i < matrix[0].length; i++){
      for(int j = 0; j < matrix.length; j++){
        allCols[i] += matrix[j][i];
      }
    }
    return allCols;
  }
  public static boolean isRowMagic(int[][] matrix){
    int[] total = ArrayOps.sumRows(matrix);
    int first = total[0];
    boolean magic = false;
    for (int i = 0; i < matrix.length; i++){
      if (total[i] != first){
        magic = false;
      } else magic = true;
    }
    return magic;
  }
  public static boolean isColMagic(int[][] matrix){
    int[] total = ArrayOps.sumCols(matrix);
    int first = total[0];
    boolean magic = false;
    for (int i = 0; i < matrix.length; i++){
      if (total[i] != first) magic = false;
      else magic = true;
    }
    return magic;
  }
  public static boolean isLocationMagic(int[][] matrix, int row, int col){
    int[] arrRow = ArrayOps.sumRows(matrix);
    int[] arrCol = ArrayOps.sumCols(matrix);
    boolean magic = false;
    if (arrRow[row] != arrRow [col]) magic = false;
    else magic = true;
    return magic;
  }
}
