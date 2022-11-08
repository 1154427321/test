package cn.luink.algorithm.leecode;

import java.util.*;

/**
 * 73. 矩阵置零
 */
public class 零矩阵 {

    public static void main(String[] args) {
        int[][] input = {
                {1,1,1},
                {1,0,1},
                {1,1,1},
        };
        int[][] input2 = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };

        setZeroes2(input2);
        watch(input2);
    }
    public static void setZeroes(int[][] matrix) {

        //记录要清零的行号和列号
        Set<Integer> rows = new HashSet();
        Set<Integer> cols = new HashSet();
        //标记为零数的行列
        for (int i=0;i < matrix.length;i++) {
            for (int j=0;j < matrix[i].length;j++) {
                if (matrix[i][j] == 0) {
                    cols.add(j);
                    rows.add(i);
                }
            }
        }
        //清除行
        for (Integer row : rows) {
            for (int i=0;i < matrix.length;i++) {
                for (int j=0;j < matrix[i].length;j++) {
                    if (row.intValue() == i) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        //清除列
        for (Integer col : cols) {
            for (int i=0;i < matrix.length;i++) {
                for (int j=0;j < matrix[i].length;j++) {
                    if (col.intValue() == j) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }

    public static void setZeroes2(int[][] matrix) {

        //记录要清零的行号和列号
        boolean[] rowFlag = new boolean[matrix.length];
        boolean[] colFlag = new boolean[matrix[0].length];
        //标记为零数的行列
        for (int i=0;i < matrix.length;i++) {
            for (int j=0;j < matrix[i].length;j++) {
                if (matrix[i][j] == 0) {
                    colFlag[j] = true;
                    rowFlag[i] = true;
                }
            }
        }
        for (int i=0;i < matrix.length;i++) {
            for (int j=0;j < matrix[i].length;j++) {
                if (colFlag[j] || rowFlag[i]) matrix[i][j]=0;
            }
        }

    }

    //用于观察 遍历输出
    public static void watch(int[][] a){
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println("");
        }
    }

    //用于观察 遍历输出
    public static void watch(boolean[][] a){
        for (boolean[] ints : a) {
            for (boolean anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println("");
        }
    }
}
