package cn.luink.algorithm.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1790. 仅执行一次字符串交换能否使两个字符串相等
 *
 * 输入：s1 = "bank", s2 = "kanb"
 * 输出：true
 * 解释：例如，交换 s2 中的第一个和最后一个字符可以得到 "bank"
 *
 * 示例 2：
 *
 * 输入：s1 = "attack", s2 = "defend"
 * 输出：false
 * 解释：一次字符串交换无法使两个字符串相等
 *
 * 示例 3：
 *
 * 输入：s1 = "kelb", s2 = "kelb"
 * 输出：true
 * 解释：两个字符串已经相等，所以不需要进行字符串交换
 *
 * 示例 4：
 *
 * 输入：s1 = "abcd", s2 = "dcba"
 * 输出：false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/check-if-one-string-swap-can-make-strings-equal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 仅执行一次字符串交换能否使两个字符串相等 {
    public static void main(String[] args) {


    }

    /**
     * 思路：只能交换一次，意思是两条字符串只有两处不同，其他位置全部相同 不可能多或者少 因为多必然会增加次数，
     * 少则不能完成交换，所以只要对比两条字符串，记录不同位置的下标交换后对比即可
     * @param s1
     * @param s2
     * @return
     */
    public static boolean areAlmostEqual(String s1, String s2) {

        Map<Integer,String> map = new HashMap<>();

        for (int i = 0; i < s2.length(); i++) {
            s2.charAt(i);
        }

        return s1.equals(s2);
    }
}
