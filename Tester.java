import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[][] A = {{1, 0, 12, -1},
                 {7, -2, 2, 1},
                 {-5, -2, 2, -9},
                };
    int[][] B = {{1, -2, 3},
                 {4, -5, -6, 7},
                 {8},
                };
    int[][] C = {{13, -1},
                 {6, 2, 5},
                 {-9, 4, -11, 8},
                };
    int[] D = {1, 3, 5};
    int[] E = {};
    int[] F = {10, -4, 2};
    int[] G = {9, 9, -1, 7};

    System.out.println(ArrayOps.sum(D));  //9
    System.out.println(ArrayOps.sum(E));  //0
    System.out.println(ArrayOps.sum(F));  //8

    System.out.println(ArrayOps.largest(D));  //5
    System.out.println(ArrayOps.largest(F));  //10
    System.out.println(ArrayOps.largest(G));  //9

    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));  //[12, 8, -14]
    System.out.println(Arrays.toString(ArrayOps.sumRows(B)));  //[2, 0, 8]
    System.out.println(Arrays.toString(ArrayOps.sumRows(C)));  //[12, 13, -8]

    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));  //[12, 7, 2]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(B)));  //[3, 7, 8]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(C)));  //[13, 6, 8]

    System.out.println(ArrayOps.sum(A));  //6
    System.out.println(ArrayOps.sum(B));  //10
    System.out.println(ArrayOps.sum(C));  //17  
  }
}
