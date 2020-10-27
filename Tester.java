import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[] A = {1, 3, 5};
    int[] B = {};
    int[] C = {10, -4, 2};
    int[] D = {9, 9, -1, 7};
    int[][] E = {{1, 2, 3},
                 {4, 5, 6},
                 {7, 8, 9}};
    int[][] F = {{1, 0, 12, -1},
                 {7, -2, 2, 1},
                 {-5, -2, 2, -9}};
    int[][] G = {{2, 1, 4, -8},
                 {-1, 7, -3, 15},
                 {-4, 14, -4, -9}};
    int[][] H = {{-9, 1},
                 {0, 8},
                 {-3, 7},
                 {-5, -4}};
    int[][] I = {{1, -2, 3},
                 {4, -5, -6, 7},
                 {8}};
    int[][] J = {{13, -1},
                 {6, 2, 5},
                 {-9, 4, -11, 8}};
    int[][] K = {{},
                 {1, 1, 2},
                 {-5, 3},
                 {7, 8, 9}};
    int[][] L = {{1, 2, 3, 4},
                 {2, 3, 4, 1},
                 {3, 4, 1, 2}};
    int[][] M = {{1, 1, 1},
                 {2, 2, 2},
                 {3, 3, 3}};
    int[][] N = {{2, 2, 2},
                 {2, 2, 2}};

    System.out.println(ArrayOps.sum(A));  //9
    System.out.println(ArrayOps.sum(B));  //0
    System.out.println(ArrayOps.sum(C));  //8
    System.out.println(ArrayOps.sum(D));  //24
    System.out.println(ArrayOps.largest(A));  //5
    System.out.println(ArrayOps.largest(C));  //10
    System.out.println(ArrayOps.largest(D));  //9
    System.out.println(Arrays.toString(ArrayOps.sumRows(E)));  //[6, 15, 24]
    System.out.println(Arrays.toString(ArrayOps.sumRows(F)));  //[12, 8, -14]
    System.out.println(Arrays.toString(ArrayOps.sumRows(G)));  //[-1, 18, -3]
    System.out.println(Arrays.toString(ArrayOps.sumRows(H)));  //[-8, 8, 4, -9]
    System.out.println(Arrays.toString(ArrayOps.sumRows(I)));  //[2, 0, 8]
    System.out.println(Arrays.toString(ArrayOps.sumRows(J)));  //[12, 13, -8]
    System.out.println(Arrays.toString(ArrayOps.sumRows(K)));  //[0, 4, -2, 24]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(F)));  //[12, 7, 2]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(G)));  //[4, 15, 14]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(H)));  //[1, 8, 7, -4]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(J)));  //[3, 7, 8]
    System.out.println(ArrayOps.sum(F));  //6
    System.out.println(ArrayOps.sum(G));  //14
    System.out.println(ArrayOps.sum(H));  //-5
    System.out.println(ArrayOps.sum(I));  //10
    System.out.println(ArrayOps.sum(J));  //17
    System.out.println(ArrayOps.sum(K));  //26
    System.out.println(Arrays.toString(ArrayOps.sumCols(E)));  //[12, 15, 18]
    System.out.println(Arrays.toString(ArrayOps.sumCols(F)));  //[3, -4, 16, -9]
    System.out.println(Arrays.toString(ArrayOps.sumCols(G)));  //[-3, 22, -3, -2]
    System.out.println(Arrays.toString(ArrayOps.sumCols(H)));  //[-17, 12]
    System.out.println(ArrayOps.isRowMagic(E));  //false
    System.out.println(ArrayOps.isRowMagic(F));  //false
    System.out.println(ArrayOps.isRowMagic(L));  //true
    System.out.println(ArrayOps.isRowMagic(M));  //false
    System.out.println(ArrayOps.isRowMagic(N));  //true
  }
}
