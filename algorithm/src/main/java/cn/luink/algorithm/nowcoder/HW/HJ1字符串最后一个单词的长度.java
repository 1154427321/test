package cn.luink.algorithm.nowcoder.HW;

import java.util.Scanner;

public class HJ1字符串最后一个单词的长度 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        if (next.contains(" ")) {
            System.out.println(next.substring(next.lastIndexOf(" ")).length()-1);
        }else {
            System.out.println(next.length());
        }

    }
}
