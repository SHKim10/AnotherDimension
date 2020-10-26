public class ArrayOps{
  public static int sum(int[] arr){
    int add = 0;
    for (int i = 0; i < arr.length; i++){
      add += arr[i];
    }
    return add;
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
    int[] result = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++){
      int total = 0;
      total += ArrayOps.sum(matrix[i]);
      result[i] = total;
    }
    return result;
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
    int add = 0;
    for (int i = 0; i < arr.length; i++){
      for (int j = 0; j < arr[i].length; j++){
        add += arr[i][j];
      }
    }
    return add;
  }
}
