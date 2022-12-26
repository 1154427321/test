package cn.luink.algorithm.leecode;

import java.util.Stack;

/**
 * 1759. 统计同构子字符串的数目
 *
 * 给你一个字符串 s ，返回 s 中 同构子字符串 的数目。由于答案可能很大，只需返回对 109 + 7 取余 后的结果。
 *
 * 同构字符串 的定义为：如果一个字符串中的所有字符都相同，那么该字符串就是同构字符串。
 *
 * 子字符串 是字符串中的一个连续字符序列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "abbcccaa"
 * 输出：13
 * 解释：同构子字符串如下所列：
 * "a"   出现 3 次。
 * "aa"  出现 1 次。
 * "b"   出现 2 次。
 * "bb"  出现 1 次。
 * "c"   出现 3 次。
 * "cc"  出现 2 次。
 * "ccc" 出现 1 次。
 * 3 + 1 + 2 + 1 + 3 + 2 + 1 = 13
 *
 * 示例 2：
 *
 * 输入：s = "xy"
 * 输出：2
 * 解释：同构子字符串是 "x" 和 "y" 。
 *
 * 示例 3：
 *
 * 输入：s = "zzzzz"
 * 输出：15
 */
public class 统计同构子字符串的数目 {

    public static void main(String[] args) {
        String s = "abbcccaa";
        String z = "xy";
        String t = "zzzzz";
        System.out.println(countHomogenous(s));
    }

    public static int countHomogenous(String s) {
        //取模
        final int MOD = (int) 1e9 + 7;

        String[] strings = s.split("");
        //初始位
        char tmp = s.charAt(0);
        //相同字符出现次数
        int cnt = 0;
        //结果
        long reuslt = 0;
        //开始遍历
        for (int i = 0; i < s.length(); i++) {
            //当前位
            char c = s.charAt(i);
            //与上一位对比
            if (tmp==c) {
                //如果相同则次数增加 直接进入下次循环，且要对比的初始位不变
                cnt++;
            }else {
                //如果不相同则进入计算：求和公式
                //次数重置为1次
                //并将当前位赋予起始位
                reuslt += (cnt+1)*cnt/2;
                cnt=1;
                tmp = c;
            }
        }
        //循环结束最后一位再次计算
        reuslt += (cnt+1)*cnt/2;
        //题目规定取模
        return (int) reuslt%MOD;
    }
}
