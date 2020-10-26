import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[][] A = {{1, 0, 12, -1},
                 {7, -2, 2, 1},
                 {-5, -2, 2, -9},
                };
    int[][] B = {{2, 1, 4, -8},
                 {-1, 7, -3, 15},
                 {-4, 14, -4, -9},
                };
    int[][] C = {{-9, 1},
                 {0, 8},
                 {-3, 7},
                 {-5, -4}
               };
    int[][] D = {{1, -2, 3},
                 {4, -5, -6, 7},
                 {8},
                };
    int[][] E = {{13, -1},
                 {6, 2, 5},
                 {-9, 4, -11, 8},
                };
    int[][] F = {{},
                 {1, 1, 2},
                 {-5, 3},
                 {7, 8, 9},
               };
    int[] G = {1, 3, 5};
    int[] H = {};
    int[] I = {10, -4, 2};
    int[] J = {9, 9, -1, 7};

    System.out.println(ArrayOps.sum(G));  //9
    System.out.println(ArrayOps.sum(H));  //0
    System.out.println(ArrayOps.sum(I));  //8
    System.out.println(ArrayOps.sum(J));  //24

    System.out.println(ArrayOps.largest(G));  //5
    System.out.println(ArrayOps.largest(I));  //10
    System.out.println(ArrayOps.largest(J));  //9

    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));  //[12, 8, -14]
    System.out.println(Arrays.toString(ArrayOps.sumRows(B)));  //[-1, 18, -3]
    System.out.println(Arrays.toString(ArrayOps.sumRows(C)));  //[-8, 8, 4, -9]
    System.out.println(Arrays.toString(ArrayOps.sumRows(D)));  //[2, 0, 8]
    System.out.println(Arrays.toString(ArrayOps.sumRows(E)));  //[12, 13, -8]
    System.out.println(Arrays.toString(ArrayOps.sumRows(F)));  //[0, 4, -2, 24]

    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));  //[12, 7, 2]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(B)));  //[4, 15, 14]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(C)));  //[1, 8, 7, -4]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(D)));  //[3, 7, 8]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(E)));  //[13, 6, 8]

    System.out.println(ArrayOps.sum(A));  //6
    System.out.println(ArrayOps.sum(B));  //14
    System.out.println(ArrayOps.sum(C));  //-5
    System.out.println(ArrayOps.sum(D));  //10
    System.out.println(ArrayOps.sum(E));  //17
    System.out.println(ArrayOps.sum(F));  //26
  }
}
