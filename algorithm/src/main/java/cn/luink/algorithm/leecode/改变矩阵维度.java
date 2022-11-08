package cn.luink.algorithm.leecode;

import java.util.Iterator;

/**
 * leecode 566. 重塑矩阵
 */
public class 改变矩阵维度 {

    public static void main(String[] args) {
        int[][] array = {{1,2}, {3,4}};

        int[][] ints = matrixReshape(array, 1, 4);
//        for (int[] anInt : ints) {
//            for (int i : anInt) {
//                System.out.print(i);
//            }
//            System.out.println("");
//        }

    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        //数组横轴长度
        int m = mat.length;
        //数组纵轴轴长度
        int n = mat[0].length;
        //计算图形面积，不相同则返回
        if (m * n != r * c) {
            return mat;
        }
        //创建转换后的新数组
        int[][] result = new int[r][c];
        int index = 0;
        //填充
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                /**
                 * mat[0][0]
                 * mat[0][1]
                 * mat[1][0]
                 * mat[1][1]
                 */
                result[i][j] = mat[index / n][index % n];
                index++;
            }
        }
        return result;
    }
}
